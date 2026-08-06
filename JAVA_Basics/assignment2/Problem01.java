package assignment2;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.time.*;

public class Problem01 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", "IT", 60000),
            new Employee(2, "Bob", "HR", 45000),
            new Employee(3, "Charlie", "IT", 75000),
            new Employee(4, "Diana", "Finance", 50000)
        );

        double avgSalary = employees.stream()
                                    .mapToDouble(Employee::getSalary)
                                    .average()
                                    .orElse(0.0);

        List<String> highEarners = employees.stream()
                                            .filter(e -> e.getSalary() > avgSalary)
                                            .map(Employee::getName)
                                            .collect(Collectors.toList());

        System.out.println("Average Salary: " + avgSalary);
        System.out.println("Employees earning > avg: " + highEarners);
    }
}
