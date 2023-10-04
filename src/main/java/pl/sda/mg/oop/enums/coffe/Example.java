package pl.sda.mg.oop.enums.coffe;

public class Example {
    public static void main(String[] args) {
        Coffee[] coffee=Coffee.values();

        for (Coffee coffees : coffee) {
            System.out.println("Kawa: "+coffees);
            System.out.println("Rodzaj mleka: "+ coffees.getMilk().getPlName());
            System.out.println("Cena: "+coffees.getPrice());
            System.out.println("*************************");
        }
    }
}
