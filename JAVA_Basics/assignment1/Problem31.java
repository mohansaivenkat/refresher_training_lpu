package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem31 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Python", "JavaScript", "C", "C++");
        words.stream()
             .max(Comparator.comparingInt(String::length))
             .ifPresent(longest -> System.out.println("Longest string: " + longest));
    }
}
