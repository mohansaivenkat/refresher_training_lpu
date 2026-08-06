package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem27 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Red", "Green", "Blue");
        String result = words.stream()
                             .collect(Collectors.joining(", "));
        System.out.println(result);
    }
}
