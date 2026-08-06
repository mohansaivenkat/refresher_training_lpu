package assignment2;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.time.*;

public class Problem17 {
    public static void main(String[] args) {
        List<Booking> bookings = Arrays.asList(
            new Booking("Deluxe", "Alice", LocalDate.of(2026, 8, 1), LocalDate.of(2026, 8, 4), 150.0),
            new Booking("Suite", "Bob", LocalDate.of(2026, 8, 2), LocalDate.of(2026, 8, 5), 300.0),
            new Booking("Deluxe", "Charlie", LocalDate.of(2026, 8, 5), LocalDate.of(2026, 8, 7), 150.0)
        );

        bookings.stream()
            .collect(Collectors.groupingBy(Booking::getRoomType, Collectors.counting()))
            .entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .ifPresent(e -> System.out.println("Most popular room type: " + e.getKey()));

        Map<String, Double> revenuePerRoomType = bookings.stream()
            .collect(Collectors.groupingBy(
                Booking::getRoomType,
                Collectors.summingDouble(Booking::getTotalRevenue)
            ));

        System.out.println("Total revenue per room type: " + revenuePerRoomType);
    }
}
