package Uppgift3.LambdaKata;

import java.util.List;
import java.util.stream.IntStream;


public class SumElements {
    
    public static int calculate(List<Integer> numbers) {
       return numbers.stream().mapToInt(num -> num).sum();
    }
}
