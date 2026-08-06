package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem06 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("quiz", "buzz", "jazz", "apple");
        words.stream()
             .filter(s -> s.endsWith("z"))
             .findAny()
             .ifPresent(System.out::println);
    }
}
