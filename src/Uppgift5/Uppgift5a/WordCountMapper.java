package Uppgift5.Uppgift5a;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCountMapper {


    public WordCountMapper() {
    }

    public Map<Integer, List<String>> createMap() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/Uppgift5/Uppgift5a/data.txt"))) {
            return br.lines().collect(Collectors.groupingBy(String::length));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new HashMap<>();
    }

}
