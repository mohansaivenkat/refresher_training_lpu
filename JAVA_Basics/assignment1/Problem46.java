package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem46 {
    public static void main(String[] args) {
        String sentence = "Hello World Java Stream";
        String reversedWords = Arrays.stream(sentence.split("\\s+"))
                                     .map(word -> new StringBuilder(word).reverse().toString())
                                     .collect(Collectors.joining(" "));
        System.out.println(reversedWords);
    }
}
