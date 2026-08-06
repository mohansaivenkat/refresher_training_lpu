package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem23 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6);
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates = numbers.stream()
                                          .filter(n -> !seen.add(n))
                                          .distinct()
                                          .collect(Collectors.toList());
        System.out.println("Duplicates: " + duplicates);
    }
}
