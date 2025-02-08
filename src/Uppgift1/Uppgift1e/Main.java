package Uppgift1.Uppgift1e;

import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        BookUtil util = new BookUtil();

        double average2 = util.getBooks().stream().mapToInt(Book::getGrade).average().orElse(0);
        System.out.println(average2);

        long numOfBooksBelongToMeAndRed = util.getBooks().stream().filter(book -> book.getOwner().equalsIgnoreCase("Andreas")
                                                                                       && book.getColor().equalsIgnoreCase("Red"))
                                                                  .count();


        long numOfBooksBelongToMeAndRed2 = util.getBooks().stream().filter(book -> book.getOwner().equalsIgnoreCase("Andreas"))
                                                                   .filter(book -> book.getColor().equalsIgnoreCase("Red"))
                                                                   .count();


        System.out.println(numOfBooksBelongToMeAndRed2);

        boolean hasEmilyWhite = util.getBooks().stream().anyMatch(book -> book.getAuthor().equalsIgnoreCase("Emily White"));
        System.out.println(hasEmilyWhite);
    }
}
