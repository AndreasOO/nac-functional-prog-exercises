package Uppgift3.LambdaKata;

import java.util.List;
import java.util.stream.Collectors;


public class UpperCase {

    public static List<String> transform(List<String> l){
        return l.stream().map(String::toUpperCase).toList();
    }
}
