package Uppgift6;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ContactSearcher {
    private final String searchTerm;
    public final Predicate<Contact> searchByName;
    public final Predicate<Contact> searchByAge;
    public final Predicate<Contact> searchByPhoneNumber;

    public ContactSearcher(String searchTerm) {
        this.searchTerm = searchTerm;
        searchByName = contact -> contact.getName().equalsIgnoreCase(searchTerm);
        searchByAge = contact -> contact.getAge() == Integer.parseInt(searchTerm);
        searchByPhoneNumber = contact -> contact.getPhone().equals(searchTerm);
    }

    public List<Contact> search(Predicate<Contact> predicate) {
        return ContactDAO.getAllContacts().stream().filter(predicate).toList();
    }

    public Predicate<Contact> byName() {
        return searchByName;
    }
    public Predicate<Contact> byAge() {
        return searchByAge;
    }
    public Predicate<Contact> byPhoneNumber() {
        return searchByPhoneNumber;
    }



}
