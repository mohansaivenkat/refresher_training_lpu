package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem34 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "A", "C", "B");
        Set<String> set = list.stream()
                              .collect(Collectors.toSet());
        System.out.println(set);
    }
}
