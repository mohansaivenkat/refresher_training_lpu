package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem45 {
    public static void main(String[] args) {
        String sentence = "java stream api java stream coding";
        Map<String, Long> wordFrequency = Arrays.stream(sentence.split("\\s+"))
                                                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(wordFrequency);
    }
}
