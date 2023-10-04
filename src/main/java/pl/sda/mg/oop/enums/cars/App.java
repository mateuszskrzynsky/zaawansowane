package pl.sda.mg.oop.enums.cars;

public class App {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setBrand(Brand.AUDI);
        car1.setModel("Q5");
        car1.setFuelType(FuelType.DIESEL);
        car1.setPrice(250_000);

        Car car2 = new Car();
        car2.setBrand(Brand.KIA);
        car2.setModel("OPTIMA");
        car2.setFuelType(FuelType.GASOLINE);
        car2.setPrice(150_000);

        Car car3 = new Car();
        car3.setBrand(Brand.FIAT);
        car3.setModel("500L");
        car3.setFuelType(FuelType.LPG);
        car3.setPrice(100_000);

        Car car4 =new Car();
        car4.setBrand(Brand.TESLA);
        car4.setModel("S");
        car4.setFuelType(FuelType.ELECTRIC);
        car4.setPrice(350_000);

        Car car5 =new Car();
        car5.setBrand(Brand.TOYOTA);
        car5.setModel("AURIS");
        car5.setFuelType(FuelType.HYBRID);
        car5.setPrice(90_000);

        Car[] cars = new Car[5];
        cars[0]=car1;
        cars[1]=car2;
        cars[2]=car3;
        cars[3]=car4;
        cars[4]=car5;

        for (Car car : cars) {
            System.out.println(car);
            System.out.println("==================");
        }

    }
}
