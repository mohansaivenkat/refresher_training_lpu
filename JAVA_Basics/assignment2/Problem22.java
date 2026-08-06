package assignment2;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.time.*;

public class Problem22 {
    public static void main(String[] args) {
        List<String[]> csvData = Arrays.asList(
            new String[]{"1", "Alice", "IT", "60000"},
            new String[]{"2", "Bob", "HR", "45000"},
            new String[]{"3", "Charlie", "IT", "75000"}
        );

        List<Employee> employees = csvData.stream()
            .map(row -> new Employee(
                Integer.parseInt(row[0]),
                row[1],
                row[2],
                Double.parseDouble(row[3])
            ))
            .collect(Collectors.toList());

        double totalSalary = employees.stream()
                                     .mapToDouble(Employee::getSalary)
                                     .sum();

        System.out.println("Parsed Employees: " + employees);
        System.out.println("Total Salary: " + totalSalary);
    }
}
