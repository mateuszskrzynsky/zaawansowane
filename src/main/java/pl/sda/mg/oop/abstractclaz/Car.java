package pl.sda.mg.oop.abstractclaz;

public abstract class Car {
    private final String vin;
    private final String fuel;

    public Car(String vin, String fuel) {
        this.vin = vin;
        this.fuel = fuel;
    }

    public String getVin() {
        return vin;
    }

    abstract void runEngine();
}
