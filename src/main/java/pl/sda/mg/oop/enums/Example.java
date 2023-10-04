package pl.sda.mg.oop.enums;

public class Example {
    public static void main(String[] args) {
        Coffee[] coffee=Coffee.values();

        for (Coffee coffee1 : coffee) {
            System.out.println("Kawa: "+coffee1);
            System.out.println("Rodzaj mleka: "+ coffee1.getMilk().getPlName());
            System.out.println("Cena: "+coffee1.getPrice());
            System.out.println("*************************");
        }
    }
}
