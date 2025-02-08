package Uppgift3.LambdaKata;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;


public class Joining {
        public static String namesToString(List<Person> people) {
            return String.format("Names: %s.", people.stream().map(Person::getName).collect(Collectors.joining(", ")));

    }
}
