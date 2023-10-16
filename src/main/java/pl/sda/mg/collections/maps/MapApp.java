package pl.sda.mg.collections.maps;

import pl.sda.mg.collections.sets.Car;

import java.util.HashMap;
import java.util.Map;

public class MapApp {
    public static void main(String[] args) {
        Map<String, Integer> employees = new HashMap<>();
        employees.put("Jan Kowalski", 10_000);
        employees.put("Anna Szyszka", 13_000);
        employees.put("Karol Wojtyła", 15_000);
        employees.put("Wojcicech Lubicz", 18_000);
        employees.put("Wojcicech Lubicz", 18_000);

        System.out.println(employees);
        System.out.println("Rozmiar mapy" + employees.size());


        Map<Car, Integer> cars = new HashMap<>();
        Car car1= new Car("Opel","Astra");
        Car car2= new Car("Audi","A6");
        Car car3= new Car("BMW","528i");

        cars.put(car1,10_000);
        cars.put(car2,80_000);
        cars.put(car3,50_000);

        System.out.println(cars.get(car1));

        System.out.println(cars);
        System.out.println("Rozmiar mapy"+cars.size());


    }
}
