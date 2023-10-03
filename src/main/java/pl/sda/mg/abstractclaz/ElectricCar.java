package pl.sda.mg.abstractclaz;

public class ElectricCar extends Car{

    public ElectricCar(String vin, String fuel) {
        super(vin, fuel);
    }

    @Override
    void runEngine() {
        System.out.println("Jestem autem z napędem elektrycznym!");
    }
}
