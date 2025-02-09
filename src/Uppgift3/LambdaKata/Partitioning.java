package Uppgift3.LambdaKata;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Partitioning {

    public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
//        Map<Boolean, List<Person>> partitionedPeople = new HashMap<>();
//        partitionedPeople.put(true, people.stream().filter(person -> person.getAge() >= 18).collect(Collectors.toList()));
//        partitionedPeople.put(false, people.stream().filter(person -> person.getAge() < 18).collect(Collectors.toList()));
//        return partitionedPeople;

//        return people.stream().collect(Collectors.groupingBy(Person::isAdult));
//        return people.stream().collect(Collectors.groupingBy(person -> person.getAge() >= 18));
//        return people.stream().collect(Collectors.partitioningBy(Person::isAdult));
        return people.stream().collect(Collectors.partitioningBy(person -> person.getAge() >= 18));
    }
}
