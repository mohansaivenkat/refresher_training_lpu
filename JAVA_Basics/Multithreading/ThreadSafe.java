package Multithreading;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafe {

    public static void main(String[] args) {

        testCopyOnWriteArrayList();
        testConcurrentHashMap();
    }

    public static void testCopyOnWriteArrayList() {

        System.out.println("===== Testing CopyOnWriteArrayList =====");

        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 100; i++) {
                list.add("A" + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i <= 100; i++) {
                list.add("B" + i);
            }
        });

        t1.start();
        t2.start();

        System.out.println("CopyOnWriteArrayList Size : " + list.size());
    }

    public static void testConcurrentHashMap() {

        System.out.println("===== Testing ConcurrentHashMap =====");

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 100; i++) {
                map.put(i, "A" + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i <= 100; i++) {
                map.put(i, "B" + i);
            }
        });

        t1.start();
        t2.start();

        System.out.println("ConcurrentHashMap Size : " + map.size());
    }
}