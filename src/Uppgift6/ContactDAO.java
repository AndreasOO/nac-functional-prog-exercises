package Uppgift6;

import java.util.ArrayList;
import java.util.List;

public class ContactDAO {
    private static final List<Contact> contacts = List.of(
            new Contact("Andy Pandy", 23, "004566334"),
            new Contact("John Doe", 25, "004563234"),
            new Contact("Jane Smith", 30, "004561234"),
            new Contact("Robert Brown", 28, "004569876"),
            new Contact("Sarah White", 35, "004563891"),
            new Contact("Michael Green", 40, "004567654"),
            new Contact("Emily Black", 29, "004565432"),
            new Contact("David Clark", 34, "004567890"),
            new Contact("Sophia Lewis", 22, "004566789"),
            new Contact("Lucas Young", 24, "004564321"),
            new Contact("Ava King", 27, "004561765"),
            new Contact("Ethan Scott", 32, "004568987"),
            new Contact("Charlotte Adams", 33, "004563210"),
            new Contact("Benjamin Harris", 26, "004567321"),
            new Contact("Mia Robinson", 23, "004564567"),
            new Contact("James Carter", 31, "004562345"),
            new Contact("Amelia Evans", 36, "004569123"),
            new Contact("William Hall", 38, "004566456"),
            new Contact("Isabella Nelson", 21, "004565678"),
            new Contact("Oliver Baker", 27, "004567123"),
            new Contact("Lily Perez", 30, "004561987"),
            new Contact("Elijah Mitchell", 24, "004564876"),
            new Contact("Sophie Wilson", 28, "004563678"),
            new Contact("Henry Moore", 26, "004562890"),
            new Contact("Chloe Garcia", 34, "004565432"),
            new Contact("Samuel Turner", 29, "004561432"),
            new Contact("Grace Hill", 25, "004567890"),
            new Contact("Noah Allen", 33, "004563567"),
            new Contact("Zoe Carter", 32, "004561234"),
            new Contact("Jack White", 30, "004568765"),
            new Contact("Harper Scott", 21, "004564321"),
            new Contact("Mason Adams", 38, "004562567"),
            new Contact("Ella Lopez", 23, "004565234"),
            new Contact("Jacob Green", 40, "004561678"),
            new Contact("Aiden Clark", 27, "004563123"),
            new Contact("Madison Johnson", 34, "004564876"),
            new Contact("Ryan Davis", 29, "004567234"),
            new Contact("Aria Moore", 31, "004569876"),
            new Contact("Carter Rodriguez", 25, "004562123"),
            new Contact("Scarlett Martinez", 28, "004561123"),
            new Contact("Dylan White", 32, "004563432"),
            new Contact("Leah King", 24, "004565765"),
            new Contact("Wyatt Hall", 26, "004567890"),
            new Contact("Nora Perez", 21, "004564234"),
            new Contact("Sebastian Young", 35, "004562678"),
            new Contact("Avery Wilson", 29, "004565123"),
            new Contact("Isaac Lee", 27, "004563765"),
            new Contact("Landon Harris", 33, "004561345"),
            new Contact("Cora Evans", 24, "004564567"),
            new Contact("Jackie Roberts", 32, "004561654"),
            new Contact("Eli Moore", 36, "004565432")
    );

    public static List<Contact> getAllContacts() {
        return contacts;
    }
}
