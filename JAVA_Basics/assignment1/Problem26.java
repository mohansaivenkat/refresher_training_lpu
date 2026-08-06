package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem26 {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Long> frequencyMap = items.stream()
                                              .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequencyMap);
    }
}
