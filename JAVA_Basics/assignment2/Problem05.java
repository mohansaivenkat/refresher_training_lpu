package assignment2;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.time.*;

public class Problem05 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", "IT", 60000),
            new Employee(2, "Bob", "HR", 45000),
            new Employee(3, "Charlie", "IT", 75000),
            new Employee(4, "Diana", "Finance", 50000)
        );

        List<String> uniqueDepts = employees.stream()
                                           .map(Employee::getDepartment)
                                           .distinct()
                                           .collect(Collectors.toList());

        System.out.println(uniqueDepts);
    }
}
