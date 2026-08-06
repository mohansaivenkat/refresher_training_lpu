package assignment2;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.time.*;

public class Problem07 {
    public static void main(String[] args) {
        List<String[]> listOfArrays = Arrays.asList(
            new String[]{"Java", "Python"},
            new String[]{"C++", "JavaScript"},
            new String[]{"Go", "Rust"}
        );

        List<String> flatList = listOfArrays.stream()
                                           .flatMap(Arrays::stream)
                                           .collect(Collectors.toList());

        System.out.println(flatList);
    }
}
