package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem18 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int product = numbers.stream()
                             .reduce(1, (a, b) -> a * b);
        System.out.println("Product: " + product);
    }
}
