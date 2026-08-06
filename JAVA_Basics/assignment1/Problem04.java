package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem04 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("JAVA", "STREAM", "API");
        words.stream()
             .map(String::toLowerCase)
             .forEach(System.out::println);
    }
}
