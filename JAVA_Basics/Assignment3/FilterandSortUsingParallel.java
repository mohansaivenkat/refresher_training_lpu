package Assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterandSortUsingParallel {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 1000000; i++) {
            list.add(i);
        }

        List<Integer> result = list.parallelStream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result.size());
    }
}
