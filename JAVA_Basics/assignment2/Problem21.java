package assignment2;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.time.*;

public class Problem21 {
    public static void main(String[] args) {
        List<Category> categories = Arrays.asList(
            new Category("Electronics", Arrays.asList(new Category("Mobiles", null), new Category("Laptops", null))),
            new Category("Clothing", Arrays.asList(new Category("Men", null), new Category("Women", null)))
        );

        List<String> allCategoryNames = categories.stream()
            .flatMap(cat -> Stream.concat(Stream.of(cat), cat.getSubCategories().stream()))
            .map(Category::getName)
            .collect(Collectors.toList());

        System.out.println(allCategoryNames);
    }
}
