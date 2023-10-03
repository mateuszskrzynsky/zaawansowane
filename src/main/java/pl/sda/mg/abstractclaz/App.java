package pl.sda.mg.abstractclaz;

public class App {
    public static void main(String[] args) {
        Car car = new DieselCar("123","diesel");
        DieselCar car2 = new DieselCar("5555","diesel");
        Car electricCar= new ElectricCar("098","electric");

        System.out.println(car.getVin());
        System.out.println(car2.getVin());

        System.out.println(car2.getRandomInt());
     //   System.out.println(car.getRandomInt());

        car.runEngine();
        car2.runEngine();
        electricCar.runEngine();

    }
}
