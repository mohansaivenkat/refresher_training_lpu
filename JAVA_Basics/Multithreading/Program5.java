package Multithreading;
import java.util.ArrayList;
import java.util.List;

public class Program5 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10000000; i++) {
            list.add(i);
        }

        System.out.println("Main start");

        //    PARALLEL STREAM
        long startPar = System.currentTimeMillis();

        long sumPar = list.parallelStream()
                .mapToLong(n -> n)
                .sum();

        long endPar = System.currentTimeMillis();

        long startSeq = System.currentTimeMillis();

        long sumSeq = list.stream()
                .mapToLong(n -> n)
                .sum();

        long endSeq = System.currentTimeMillis();

        System.out.println(endSeq - startSeq);
        System.out.println(endPar - startPar);
    }
}