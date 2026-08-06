package assignment2;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.time.*;

public class Problem04 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 1200.0),
            new Product("Phone", 800.0),
            new Product("Tablet", 500.0)
        );

        Map<String, Double> productPriceMap = products.stream()
                                                     .collect(Collectors.toMap(
                                                         Product::getName,
                                                         Product::getPrice
                                                     ));

        System.out.println(productPriceMap);
    }
}
