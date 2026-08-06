package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem09 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 8, 30);
        boolean allPositive = numbers.stream()
                                     .allMatch(n -> n > 0);
        System.out.println("All positive: " + allPositive);
    }
}
