package Uppgift1.Uppgift1c;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        BookUtil util = new BookUtil();
        List<Book> list1 = new ArrayList<>();
        List<Book> list2 = new ArrayList<>();
        for (int i = 0; i < util.getBooks().size(); i++) {
            if (i%2 == 0) {
                list1.add(util.getBooks().get(i));
            } else {
                list2.add(util.getBooks().get(i));
            }
        }

        System.out.println(extractTitles(List.of(list1, list2)));


    }

    private static List<String> extractTitles(List<List<Book>> bookLists) {
        return bookLists.stream().flatMap(List::stream).map(Book::getTitle).toList();
    }
}
