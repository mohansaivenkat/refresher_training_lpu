package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem10 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", null, "Python", null, "C++");
        List<String> nonNullList = list.stream()
                                       .filter(Objects::nonNull)
                                       .collect(Collectors.toList());
        System.out.println(nonNullList);
    }
}
