package Uppgift1.Uppgift1d;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        BookUtil util = new BookUtil();

        double average = (double) util.getBooks().stream().map(Book::getGrade).reduce(0, Integer::sum) / util.getBooks().size();

        // better solution
        double average2 = util.getBooks().stream().mapToInt(Book::getGrade).average().orElse(0);
        System.out.println(average2);

        String concatResult = util.getBooks().stream().map(Book::getTitle).reduce("", (title1, title2) -> title1 + ", " + title2).substring(2);

        // better solution
        String joinResult = util.getBooks().stream().map(Book::getTitle).collect(Collectors.joining(", "));

        System.out.println(joinResult);
    }
}
