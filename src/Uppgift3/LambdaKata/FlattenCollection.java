package Uppgift3.LambdaKata;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


public class FlattenCollection {

    public static List<String> transform(List<List<String>> l){
        return l.stream().flatMap(Collection::stream).collect(Collectors.toList());

    }

    //valfri att implementera
    static List<String> goingDeeper(List<List<List<String>>> collection) {
        return collection.stream().flatMap(Collection::stream).flatMap(Collection::stream).toList();
    }
}
