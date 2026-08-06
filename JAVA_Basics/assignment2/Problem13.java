package assignment2;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.time.*;

public class Problem13 {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
            new Order("Alice", Arrays.asList(new Item("Laptop", 1200.0), new Item("Mouse", 25.0))),
            new Order("Bob", Arrays.asList(new Item("Phone", 800.0))),
            new Order("Alice", Arrays.asList(new Item("Keyboard", 75.0)))
        );

        Map<String, Double> totalSpentByCustomer = orders.stream()
            .collect(Collectors.groupingBy(
                Order::getCustomerName,
                Collectors.summingDouble(order -> 
                    order.getItems().stream().mapToDouble(Item::getPrice).sum()
                )
            ));

        System.out.println(totalSpentByCustomer);
    }
}
