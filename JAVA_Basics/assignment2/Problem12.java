package assignment2;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.time.*;

public class Problem12 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-10, 5, -2, 8, -1, 4);

        List<Integer> sortedByAbs = numbers.stream()
                                           .sorted(Comparator.comparingInt(Math::abs))
                                           .collect(Collectors.toList());

        System.out.println(sortedByAbs);
    }
}
