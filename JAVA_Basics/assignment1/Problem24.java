package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem24 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> distinctNumbers = numbers.stream()
                                               .distinct()
                                               .collect(Collectors.toList());
        System.out.println(distinctNumbers);
    }
}
