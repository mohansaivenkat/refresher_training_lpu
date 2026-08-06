package assignment2;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.time.*;

public class Problem19 {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> nestedMap = new HashMap<>();
        Map<String, Integer> inner1 = new HashMap<>();
        inner1.put("Math", 90);
        inner1.put("Science", 85);
        nestedMap.put("Alice", inner1);

        Map<String, Integer> inner2 = new HashMap<>();
        inner2.put("Math", 78);
        inner2.put("Science", 88);
        nestedMap.put("Bob", inner2);

        List<String> flatEntries = nestedMap.entrySet().stream()
            .flatMap(outer -> outer.getValue().entrySet().stream()
                .map(inner -> outer.getKey() + " -> " + inner.getKey() + ": " + inner.getValue()))
            .collect(Collectors.toList());

        System.out.println(flatEntries);
    }
}
