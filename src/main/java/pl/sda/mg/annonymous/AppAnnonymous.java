package pl.sda.mg.annonymous;

public class AppAnnonymous {
    public static void main(String[] args) {
        Car car = new Car("111","fuel") {
            @Override
            void runEngine() {
                System.out.println("WYWOŁANIE KLASY ANONIMOWEJ");
            }
        };

        car.runEngine();
    }
}
