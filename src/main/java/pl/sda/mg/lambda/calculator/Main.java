package pl.sda.mg.lambda.calculator;

public class Main {
    public static void main(String[] args) {
        Calculator<Integer> intCalculator = new Calculator<>();

        // Użycie funkcji lambda do wykonania operacji matematycznych
        MathOpr<Integer> add = (a, b) -> a + b;
        MathOpr<Integer> sub = (a, b) -> a - b;
        MathOpr<Integer> multip = (a, b) -> a * b;
        MathOpr<Integer> div = (a, b) -> a / b;

        System.out.println("Dodawanie: " + intCalculator.calculate(5, 3, add));
        System.out.println("Odejmowanie: " + intCalculator.calculate(5, 3, sub));
        System.out.println("Mnożenie: " + intCalculator.calculate(5, 3, multip));
        System.out.println("Dzielenie: " + intCalculator.calculate(6, 3, div));
    }
}

