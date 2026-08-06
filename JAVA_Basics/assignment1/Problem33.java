package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem33 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Banana", "Cherry");
        Map<String, Integer> charCounts = words.stream()
                                               .collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(charCounts);
    }
}
