package assignment2;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.time.*;

public class Problem08 {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
            "Java Stream API is powerful",
            "Stream API makes Java coding easy",
            "Java is popular"
        );

        List<String> uniqueWords = sentences.stream()
                                           .flatMap(s -> Arrays.stream(s.split("\\s+")))
                                           .map(String::toLowerCase)
                                           .distinct()
                                           .collect(Collectors.toList());

        System.out.println(uniqueWords);
    }
}
