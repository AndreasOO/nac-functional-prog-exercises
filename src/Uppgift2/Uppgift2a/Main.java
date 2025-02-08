package Uppgift2.Uppgift2a;

public class Main {
    private static int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    public static void main(String args[]) {

      MathOperation addition = Integer::sum;

      MathOperation subtraction =  (x,y) -> x - y;

      MathOperation multiplication = (x,y) -> x * y;

      MathOperation division = (x,y) -> x / y;

      System.out.println("10 + 5 = " + operate(10, 5, addition));
      System.out.println("10 - 5 = " + operate(10, 5, subtraction));
      System.out.println("10 x 5 = " + operate(10, 5, multiplication));
      System.out.println("10 / 5 = " + operate(10, 5, division));

    }
}
