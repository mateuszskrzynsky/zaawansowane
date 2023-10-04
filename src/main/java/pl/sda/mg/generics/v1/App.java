package pl.sda.mg.generics.v1;

public class App {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        Cup<Tea> teaCup = new Cup<>(tea);
        Cup<Coffee> coffeeCup= new Cup<>(coffee);

        teaCup.drink();
        coffeeCup.drink();
    }
}
