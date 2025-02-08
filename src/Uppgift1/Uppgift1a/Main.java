package Uppgift1.Uppgift1a;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        BookUtil util = new BookUtil();


        util.getBooks().stream().filter(book -> book.getAuthor().equals("Emily White") ).forEach(System.out::println);
        util.getBooks().stream().filter(book -> book.getColor().equals("White") ).forEach(System.out::println);
        util.getBooks().stream().filter(book -> book.getOwner().equals("Andreas") ).forEach(System.out::println);
    }
}
