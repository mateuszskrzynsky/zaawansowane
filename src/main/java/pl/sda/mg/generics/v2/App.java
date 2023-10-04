package pl.sda.mg.generics.v2;

public class App {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        Cake cake = new Cake();

        Drink cocktail = new Drink() {
            @Override
            void startDrink() {
                System.out.println("Drinking delicious cocktails!");
            }
        };

        Cup<Tea> teaCup = new Cup<>(tea);
        Cup<Coffee> coffeeCup = new Cup<>(coffee);
        Cup<Drink> coctailCup = new Cup<>(cocktail);

        teaCup.drink();
        coffeeCup.drink();
        coctailCup.drink();
    }
}
