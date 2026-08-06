package assignment1;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Problem47 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Stream", "API");
        String result = list.stream()
                            .collect(Collectors.joining());
        System.out.println(result);
    }
}
