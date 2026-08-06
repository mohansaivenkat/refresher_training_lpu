package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem25 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "dog", "elephant", "bear", "lion");
        Map<Integer, List<String>> groupedByLength = words.stream()
                                                          .collect(Collectors.groupingBy(String::length));
        System.out.println(groupedByLength);
    }
}
