package Uppgift3.LambdaKata;

import java.util.List;


public class GetOldestPerson {

     public static Person getOldestPerson(List<Person> people) {
        return people.stream().max(Person::compareTo).orElseThrow();
    }
}
