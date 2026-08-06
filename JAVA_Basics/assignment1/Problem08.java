package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem08 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 17, 25, 33, 41);
        boolean exists = numbers.stream()
                                .anyMatch(n -> n % 5 == 0);
        System.out.println("Divisible by 5 exists: " + exists);
    }
}
