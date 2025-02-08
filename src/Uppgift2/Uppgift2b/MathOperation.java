package Uppgift2.Uppgift2b;

public interface MathOperation {
    int operation(int a, int b);

    default MathOperation andThen(MathOperation other){
        return (a,b) -> other.operation(operation(a,b), a);
    }
}
