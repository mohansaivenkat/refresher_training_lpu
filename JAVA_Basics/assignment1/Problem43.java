package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem43 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", "IT", 60000, 28),
            new Employee(2, "Bob", "HR", 45000, 32),
            new Employee(3, "Charlie", "IT", 70000, 25)
        );
        Map<Integer, Employee> employeeMap = employees.stream()
                                                      .collect(Collectors.toMap(Employee::getId, Function.identity()));
        System.out.println(employeeMap);
    }
}
