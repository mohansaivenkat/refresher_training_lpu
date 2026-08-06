package Multithreading;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Program2 {

    public static void main(String[] args) throws InterruptedException {

//        testArrayList();
//        testHashSet();
        testLinkedList();
    }

    // ============== Testing ArrayList ===================

    public static void testArrayList() {

        System.out.println("===== Testing ArrayList =====");

        ArrayList<String> list = new ArrayList<>();

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

        System.out.println("ArrayList Size : " + list.size());
    }

    // ============== Testing HashSet ===================

    public static void testHashSet() {

        System.out.println("===== Testing HashSet =====");

        HashSet<String> set = new HashSet<>();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 100; i++) {
                set.add("A" + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i <= 100; i++) {
                set.add("B" + i);
            }
        });

        t1.start();
        t2.start();

        System.out.println("HashSet Size : " + set.size());
    }

    // ============== Testing LinkedList ===================

    public static void testLinkedList() throws InterruptedException {

        System.out.println("===== Testing LinkedList =====");

        LinkedList<String> queue = new LinkedList<>();

        Thread producer = new Thread(() -> {

            for (int i = 0; i < 100; i++) {
                queue.add("Data-" + i);
            }

        });

        Thread consumer = new Thread(() -> {

            for (int i = 0; i < 100; i++) {

                if (!queue.isEmpty()) {
                    queue.remove();
                }

            }

        });

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();

        System.out.println(queue.size());
    }
}