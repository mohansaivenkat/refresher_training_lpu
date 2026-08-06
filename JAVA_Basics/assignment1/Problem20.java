package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem20 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> cubes = numbers.stream()
                                     .map(n -> n * n * n)
                                     .collect(Collectors.toList());
        System.out.println(cubes);
    }
}
