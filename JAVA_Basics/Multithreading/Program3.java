package Multithreading;
import java.util.ArrayList;

public class Program3 {

    public static void main(String[] args) throws InterruptedException {

        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        // Reading
        Thread t1 = new Thread(() -> {

            for (String item : list) {
                System.out.println(item);
            }

        });

        // Modifying
        Thread t2 = new Thread(() -> {

            list.add("D");

        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
