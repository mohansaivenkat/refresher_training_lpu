package Assignment3;

import java.util.ArrayList;
import java.util.List;

public class AveragelargeDatasetParallel {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 1000000; i++) {
            list.add(i);
        }

        long startParallel = System.currentTimeMillis();

        double average1 = list.parallelStream()
                .mapToInt(n -> n)
                .average()
                .orElse(0);

        long endParallel = System.currentTimeMillis();

        long startSequential = System.currentTimeMillis();

        double average2 = list.stream()
                .mapToInt(n -> n)
                .average()
                .orElse(0);

        long endSequential = System.currentTimeMillis();

        System.out.println(average1);
        System.out.println(average2);

        System.out.println(endParallel - startParallel);
        System.out.println(endSequential - startSequential);
    }
}