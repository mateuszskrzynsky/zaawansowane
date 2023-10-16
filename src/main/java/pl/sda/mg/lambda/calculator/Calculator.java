package pl.sda.mg.lambda.calculator;

public class Calculator<T extends Number> {
    T calculate(T a, T b, MathOpr<T> operation){
        return operation.opr(a,b);
    }
}
