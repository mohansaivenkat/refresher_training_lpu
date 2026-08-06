package Assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupLargeDatasetParallel {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 1000000; i++) {
            list.add(i);
        }

        Map<Boolean, List<Integer>> map = list.parallelStream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println(map.get(true).size());
        System.out.println(map.get(false).size());
    }
}
