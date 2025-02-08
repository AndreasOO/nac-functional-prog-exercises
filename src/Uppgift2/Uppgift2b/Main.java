package Uppgift2.Uppgift2b;

public class Main {
    private static int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    public static void main(String args[]) {

      MathOperation addition = Integer::sum;

      MathOperation subtraction =  (x, y) -> x - y;

      MathOperation multiplication = (x, y) -> x * y;

      MathOperation division = (x, y) -> x / y;



        System.out.println("5+5+5");
        System.out.println(operate(5, 5, addition.andThen(addition)));

        System.out.println("(5+5)*5");
        System.out.println(addition.andThen(multiplication).operation(5,5));

        System.out.println("5*5-5");
        System.out.println(multiplication.andThen(subtraction).operation(5,5));
    }
}
