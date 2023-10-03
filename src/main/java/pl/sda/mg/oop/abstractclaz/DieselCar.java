package pl.sda.mg.oop.abstractclaz;

public class DieselCar extends Car{
    public DieselCar(String vin, String fuel) {
        super(vin, fuel);
    }

    @Override
    void runEngine() {
        System.out.println("Jestem samochodem z silnikem diesla");
    }
    public int getRandomInt(){
        return 2;
    }
}
