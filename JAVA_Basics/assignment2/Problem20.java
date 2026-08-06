package assignment2;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.time.*;

public class Problem20 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", "IT", 45000),
            new Employee(2, "Bob", "IT", 75000),
            new Employee(3, "Charlie", "HR", 120000),
            new Employee(4, "Diana", "HR", 55000)
        );

        Function<Employee, String> salaryRange = e -> {
            if (e.getSalary() < 50000) return "< 50000";
            else if (e.getSalary() <= 100000) return "50000-100000";
            else return "> 100000";
        };

        Map<String, Map<String, List<Employee>>> grouped = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.groupingBy(salaryRange)
            ));

        System.out.println(grouped);
    }
}
