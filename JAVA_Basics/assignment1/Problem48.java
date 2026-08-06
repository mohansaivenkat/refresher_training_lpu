package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem48 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        int pageNumber = 2;
        int pageSize = 5;

        List<Integer> pageContent = list.stream()
                                        .skip((long) (pageNumber - 1) * pageSize)
                                        .limit(pageSize)
                                        .collect(Collectors.toList());
        System.out.println("Page " + pageNumber + ": " + pageContent);
    }
}
