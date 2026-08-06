package assignment2;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.time.*;

public class Problem02 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "Stream", "API", "Programming", "Code");

        int maxLength = strings.stream()
                               .mapToInt(String::length)
                               .max()
                               .orElse(0);

        System.out.println("Length of longest string: " + maxLength);
    }
}
