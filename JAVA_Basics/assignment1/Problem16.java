package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem16 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
        int sum = numbers.stream()
                         .mapToInt(Integer::intValue)
                         .sum();
        System.out.println("Sum: " + sum);
    }
}
