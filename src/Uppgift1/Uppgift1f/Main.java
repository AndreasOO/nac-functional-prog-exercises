package Uppgift1.Uppgift1f;

import java.text.Collator;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        BookUtil util = new BookUtil();

        List<Book> booksSortedByGrade = util.getBooks().stream().sorted(Comparator.comparing(Book::getGrade).reversed()).toList();
        System.out.println(booksSortedByGrade);



        Collator swedishCollator = Collator.getInstance(Locale.of("sv", "SE"));

        List<Book> booksSortedByTitle = util.getBooks().stream().sorted(Comparator.comparing(Book::getTitle, swedishCollator)).toList();
        System.out.println(booksSortedByTitle);
    }
}
