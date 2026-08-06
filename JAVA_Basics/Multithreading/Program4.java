package Multithreading;
import java.util.HashMap;
import java.util.Map;

public class Program4 {

    public static void main(String[] args) throws InterruptedException {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        // Reading
        Thread t1 = new Thread(() -> {

            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }

        });

        // Modifying
        Thread t2 = new Thread(() -> {

            map.put(4, "D");

        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
