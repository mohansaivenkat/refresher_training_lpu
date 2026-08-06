package assignment2;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.time.*;

public class Problem18 {
    public static void main(String[] args) {
        Map<String, List<Integer>> map = new HashMap<>();
        map.put("Group A", Arrays.asList(1, 2, 3));
        map.put("Group B", Arrays.asList(4, 5, 6));

        List<Integer> allIntegers = map.values().stream()
                                       .flatMap(List::stream)
                                       .collect(Collectors.toList());

        System.out.println(allIntegers);
    }
}
