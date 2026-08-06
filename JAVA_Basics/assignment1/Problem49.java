package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem49 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        Predicate<Integer> isPrime = n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };

        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                                                         .collect(Collectors.partitioningBy(isPrime));
        System.out.println("Primes: " + partitioned.get(true));
        System.out.println("Non-Primes: " + partitioned.get(false));
    }
}
