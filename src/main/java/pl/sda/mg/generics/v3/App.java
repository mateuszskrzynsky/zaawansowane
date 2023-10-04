package pl.sda.mg.generics.v3;

public class App {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        Car car = new Car();

        Cup teaCup = new Cup(tea);
        Cup coffeeCup = new Cup(coffee);

        Cup[] cups = new Cup[]{teaCup,coffeeCup};

        for (Cup cup : cups) {
            cup.drink();
        }

    }
}
