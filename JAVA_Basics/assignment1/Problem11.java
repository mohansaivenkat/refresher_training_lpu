package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem11 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "", "Python", "   ", "C++");
        List<String> nonEmptyList = list.stream()
                                        .filter(s -> !s.trim().isEmpty())
                                        .collect(Collectors.toList());
        System.out.println(nonEmptyList);
    }
}
