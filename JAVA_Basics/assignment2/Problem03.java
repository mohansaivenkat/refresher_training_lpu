package assignment2;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.time.*;

public class Problem03 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Banana", "Cherry");

        Map<String, Integer> stringLengthMap = strings.stream()
                                                     .collect(Collectors.toMap(
                                                         Function.identity(),
                                                         String::length,
                                                         (existing, replacement) -> existing
                                                     ));

        System.out.println(stringLengthMap);
    }
}
