package Uppgift1.Uppgift1h;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {





        BookUtil util = new BookUtil();

        Map<String, List<Book>> booksPartionedByFictionOrFact = new HashMap<>();
        booksPartionedByFictionOrFact.put("Factual", util.getBooks().stream().filter(Book::isFactual).collect(Collectors.toList()));
        booksPartionedByFictionOrFact.put("Fiction", util.getBooks().stream().filter(Book::isFiction).collect(Collectors.toList()));

        System.out.println(booksPartionedByFictionOrFact.get("Factual"));
        System.out.println(booksPartionedByFictionOrFact.get("Fiction"));
    }



}
