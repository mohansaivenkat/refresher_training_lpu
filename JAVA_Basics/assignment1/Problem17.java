package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem17 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
        numbers.stream()
               .mapToInt(Integer::intValue)
               .average()
               .ifPresent(avg -> System.out.println("Average: " + avg));
    }
}
