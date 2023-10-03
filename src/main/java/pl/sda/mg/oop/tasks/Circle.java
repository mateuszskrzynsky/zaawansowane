package pl.sda.mg.oop.tasks;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI *radius*radius;
    }

    public double calculateCircum() {
        return 2 * Math.PI * radius;
    }

}