package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem13 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);
        List<Integer> sortedDesc = numbers.stream()
                                          .sorted(Comparator.reverseOrder())
                                          .collect(Collectors.toList());
        System.out.println(sortedDesc);
    }
}
