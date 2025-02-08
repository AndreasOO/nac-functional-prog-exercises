package Uppgift5.Uppgift5b;

public class Main {
    public static void main(String[] args) {
        WordCountMapper wordCountMapper = new WordCountMapper();
        wordCountMapper.createMap().forEach((length, wordCount) -> System.out.println(length + " " + wordCount));
    }
}
