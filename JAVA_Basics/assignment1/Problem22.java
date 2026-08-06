package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem22 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 50, 30, 50, 40, 20);
        numbers.stream()
               .distinct()
               .sorted(Comparator.reverseOrder())
               .skip(1)
               .findFirst()
               .ifPresent(second -> System.out.println("Second highest: " + second));
    }
}
