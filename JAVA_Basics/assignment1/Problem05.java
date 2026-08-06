package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem05 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Banana", "Avocado", "Cherry");
        words.stream()
             .filter(s -> s.startsWith("A"))
             .findFirst()
             .ifPresent(System.out::println);
    }
}
