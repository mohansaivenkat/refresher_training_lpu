package assignment2;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.time.*;

public class Problem15 {
    public static void main(String[] args) {
        List<EmployeeFull> employees = Arrays.asList(
            new EmployeeFull(1, "Alice", "IT", 60000, LocalDate.now().minusYears(2)),
            new EmployeeFull(2, "Bob", "HR", 45000, LocalDate.now().minusYears(6)),
            new EmployeeFull(3, "Charlie", "IT", 75000, LocalDate.now().minusYears(1)),
            new EmployeeFull(4, "Diana", "HR", 50000, LocalDate.now().minusYears(3))
        );

        LocalDate fiveYearsAgo = LocalDate.now().minusYears(5);

        Map<String, Double> deptAvgSalaryRecent = employees.stream()
            .filter(e -> e.getJoiningDate().isAfter(fiveYearsAgo))
            .collect(Collectors.groupingBy(
                EmployeeFull::getDepartment,
                Collectors.averagingDouble(EmployeeFull::getSalary)
            ));

        System.out.println("Dept-wise avg salary (hired in last 5 yrs): " + deptAvgSalaryRecent);
    }
}
