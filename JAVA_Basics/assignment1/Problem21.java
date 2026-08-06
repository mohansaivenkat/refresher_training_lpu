package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem21 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alex", "Brandon", "Christopher", "Dan", "Elizabeth");
        List<String> filteredNames = names.stream()
                                          .filter(name -> name.length() > 4)
                                          .collect(Collectors.toList());
        System.out.println(filteredNames);
    }
}
