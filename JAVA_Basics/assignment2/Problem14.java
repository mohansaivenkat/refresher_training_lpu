package assignment2;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.time.*;

public class Problem14 {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book("Book 1", "Author A", 2010, "Fiction"),
            new Book("Book 2", "Author B", 2012, "Sci-Fi"),
            new Book("Book 3", "Author A", 2015, "Fiction"),
            new Book("Book 4", "Author C", 2018, "Sci-Fi"),
            new Book("Book 5", "Author A", 2020, "Non-Fiction"),
            new Book("Book 6", "Author B", 2021, "Sci-Fi")
        );

        books.stream()
             .collect(Collectors.groupingBy(Book::getGenre, Collectors.counting()))
             .entrySet().stream()
             .max(Map.Entry.comparingByValue())
             .ifPresent(e -> System.out.println("Most published genre: " + e.getKey()));

        books.stream()
             .collect(Collectors.groupingBy(Book::getAuthor, Collectors.counting()))
             .entrySet().stream()
             .max(Map.Entry.comparingByValue())
             .ifPresent(e -> System.out.println("Author with most books: " + e.getKey()));
    }
}
