package assignment2;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.time.*;

public class Problem11 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Banana", "Apple", "Dog", "Cat", "Elephant", "Ant");

        List<String> sortedWords = words.stream()
                                        .sorted(Comparator.comparingInt(String::length)
                                                          .thenComparing(Comparator.naturalOrder()))
                                        .collect(Collectors.toList());

        System.out.println(sortedWords);
    }
}
