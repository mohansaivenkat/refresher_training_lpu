package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem42 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Sam", "IT", 60000, 28),
            new Employee(2, "Bob", "HR", 45000, 32),
            new Employee(3, "Steve", "IT", 70000, 25),
            new Employee(4, "Diana", "Finance", 55000, 30)
        );
        List<Employee> startsWithS = employees.stream()
                                              .filter(e -> e.getName().startsWith("S"))
                                              .collect(Collectors.toList());
        System.out.println(startsWithS);
    }
}
