package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem07 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        int threshold = 25;
        long count = numbers.stream()
                            .filter(n -> n > threshold)
                            .count();
        System.out.println("Count: " + count);
    }
}
