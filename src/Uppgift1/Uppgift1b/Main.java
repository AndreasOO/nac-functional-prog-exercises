package Uppgift1.Uppgift1b;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        BookUtil util = new BookUtil();

        List<String> titles = util.getBooks().stream().map(Book::getTitle).toList();
        List<String> authors = util.getBooks().stream().map(Book::getAuthor).distinct().toList();
        List<String> titlesOwnedByMe = util.getBooks().stream().filter(book -> book.getOwner().equalsIgnoreCase("Andreas")).map(Book::getTitle).toList();


        System.out.println(titles);
        System.out.println(authors);
        System.out.println(titlesOwnedByMe);
    }
}
