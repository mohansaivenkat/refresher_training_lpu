package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem32 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Python", "JavaScript", "C", "C++");
        words.stream()
             .min(Comparator.comparingInt(String::length))
             .ifPresent(shortest -> System.out.println("Shortest string: " + shortest));
    }
}
