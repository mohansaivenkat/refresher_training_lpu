package assignment2;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.time.*;

public class Problem10 {
    public static void main(String[] args) {
        Map<String, List<String>> mapOfLists = new HashMap<>();
        mapOfLists.put("Tech", Arrays.asList("Java", "Python"));
        mapOfLists.put("Database", Arrays.asList("MySQL", "PostgreSQL"));

        List<String> flatList = mapOfLists.values().stream()
                                          .flatMap(List::stream)
                                          .collect(Collectors.toList());

        System.out.println(flatList);
    }
}
