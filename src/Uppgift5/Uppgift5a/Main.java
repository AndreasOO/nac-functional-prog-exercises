package Uppgift5.Uppgift5a;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        WordCountMapper wordCountMapper = new WordCountMapper();
        wordCountMapper.createMap().forEach((length, wordlist) -> System.out.println(length + " " + wordlist));
    }
}
