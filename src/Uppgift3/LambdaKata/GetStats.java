package Uppgift3.LambdaKata;

import java.util.IntSummaryStatistics;
import java.util.List;


public class GetStats {

    public static IntSummaryStatistics getStats(List<Person> people) {
        return people.stream().mapToInt(Person::getAge).summaryStatistics();
    }
}
