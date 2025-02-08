package Uppgift1.Uppgift1g;

import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        BookUtil util = new BookUtil();


        String joinResult = util.getBooks().stream().map(Book::getTitle).collect(Collectors.joining(", "));

        System.out.println(joinResult);
    }
}
