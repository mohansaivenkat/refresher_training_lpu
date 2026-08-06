package assignment2;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.time.*;

public class Problem16 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", Arrays.asList(85, 90, 88, 92, 80)),
            new Student("Bob", Arrays.asList(70, 75, 72, 68, 80)),
            new Student("Charlie", Arrays.asList(95, 98, 92, 96, 94))
        );

        List<Student> rankedStudents = students.stream()
            .sorted(Comparator.comparingDouble(Student::getPercentage).reversed())
            .collect(Collectors.toList());

        int rank = 1;
        for (Student s : rankedStudents) {
            System.out.println("Rank " + rank++ + ": " + s.getName() + " - " + String.format("%.2f", s.getPercentage()) + "%");
        }
    }
}
