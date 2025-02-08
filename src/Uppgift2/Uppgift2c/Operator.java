package Uppgift2.Uppgift2c;

public class Operator implements SingleDigitOperation {
    int num;
    SingleDigitOperation operation;

    public Operator(SingleDigitOperation operation) {
        this.num = 100;
        this.operation = operation;
    }

    static int operateOnHundred(SingleDigitOperation operation) {
        return operation.operate(100);
    }

    @Override
    public int operate(int num) {
        return operation.operate(num);
    }
}
