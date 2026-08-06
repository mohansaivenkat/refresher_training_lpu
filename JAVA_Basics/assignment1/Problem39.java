package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem39 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", "IT", 60000, 28),
            new Employee(2, "Bob", "HR", 45000, 32),
            new Employee(3, "Charlie", "IT", 70000, 25),
            new Employee(4, "Diana", "Finance", 55000, 30)
        );
        List<Employee> sortedBySalary = employees.stream()
                                                 .sorted(Comparator.comparingDouble(Employee::getSalary))
                                                 .collect(Collectors.toList());
        sortedBySalary.forEach(System.out::println);
    }
}
