package pl.sda.mg.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class CarApp {
    public static void main(String[] args) {
        Car car1= new Car("Opel","Astra");
        Car car2= new Car("Audi","A6");
        Car car3= new Car("BMW","528i");

        Set<Car> cars = new HashSet<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        System.out.println(cars);
        System.out.println("Liczba samochodów: "+cars.size());
    }
}
