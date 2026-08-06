package assignment2;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.time.*;

public class Problem09 {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
            new Order("Customer 1", Arrays.asList(new Item("Laptop", 1200.0), new Item("Mouse", 25.0))),
            new Order("Customer 2", Arrays.asList(new Item("Phone", 800.0), new Item("Headphones", 150.0)))
        );

        List<String> allItemNames = orders.stream()
                                         .flatMap(order -> order.getItems().stream())
                                         .map(Item::getName)
                                         .collect(Collectors.toList());

        System.out.println(allItemNames);
    }
}
