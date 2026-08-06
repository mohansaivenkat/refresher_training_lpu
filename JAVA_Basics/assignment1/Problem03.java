package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem03 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "stream", "api");
        words.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}
