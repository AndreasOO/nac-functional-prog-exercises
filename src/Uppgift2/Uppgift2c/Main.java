package Uppgift2.Uppgift2c;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {


        SingleDigitOperation squared = x -> x*x;

        SingleDigitOperation OneIfPositiveElseZero = x -> x > 0 ? 1 : 0;


        System.out.println(squared.operate(7));

        System.out.println(OneIfPositiveElseZero.operate(7));

        System.out.println(OneIfPositiveElseZero.operate(0));

        System.out.println(OneIfPositiveElseZero.operate(-7));


        Operator operator = new Operator(x -> x*x);
        System.out.println(operator.operate(7));

        System.out.println(Operator.operateOnHundred(x -> x+1));
        System.out.println(Operator.operateOnHundred(x -> x*x));




    }




}
