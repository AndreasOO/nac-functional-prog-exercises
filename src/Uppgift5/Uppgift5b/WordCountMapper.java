package Uppgift5.Uppgift5b;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCountMapper {


    public WordCountMapper() {
    }

    public Map<Integer, Long> createMap() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/Uppgift5/Uppgift5b/data.txt"))) {
            return br.lines().collect(Collectors.groupingBy(String::length, Collectors.counting()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new HashMap<>();
    }

}
