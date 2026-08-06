package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem14 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(15, 42, 8, 99, 23);
        numbers.stream()
               .max(Integer::compareTo)
               .ifPresent(max -> System.out.println("Max: " + max));
    }
}
