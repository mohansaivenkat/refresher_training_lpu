package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem44 {
    public static void main(String[] args) {
        String sentence = "java stream api java stream coding";
        Set<String> uniqueWords = new HashSet<>();
        Set<String> duplicateWords = Arrays.stream(sentence.split("\\s+"))
                                           .filter(word -> !uniqueWords.add(word))
                                           .collect(Collectors.toSet());
        System.out.println("Duplicate words: " + duplicateWords);
    }
}
