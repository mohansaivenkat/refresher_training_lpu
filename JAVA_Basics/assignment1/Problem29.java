package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem29 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80);
        numbers.stream()
               .limit(5)
               .forEach(System.out::println);
    }
}
