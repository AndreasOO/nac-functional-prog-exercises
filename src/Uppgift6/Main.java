package Uppgift6;

import java.io.EOFException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {

            while (true) {
                System.out.println("Enter search term");
                ContactSearcher searcher = new ContactSearcher(new Scanner(System.in).nextLine());



                System.out.println("Choose search option: \n" +
                        "1: Search by name\n" +
                        "2: Search by age\n" +
                        "3: Search by phone number\n");

                int choice = Integer.parseInt(new Scanner(System.in).nextLine());
                switch (choice) {
                    case 1 -> searcher.search(searcher.byName()).forEach(System.out::println);
                    case 2 -> searcher.search(searcher.byAge()).forEach(System.out::println);
                    case 3 -> searcher.search(searcher.byPhoneNumber()).forEach(System.out::println);
                    default -> System.out.println("Invalid choice");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
