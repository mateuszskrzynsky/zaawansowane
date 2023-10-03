package pl.sda.mg.oop.tasks;

public class CircleApp {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0);
        System.out.println("Pole koła: " + circle.calculateArea());
        System.out.println("Obwód okręgu: " + circle.calculateCircum());
    }
}
