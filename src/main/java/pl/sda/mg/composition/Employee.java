package pl.sda.mg.composition;

public class Employee {
    String name;
    String pesel;
    Salary salary;
    Address address;

    public Salary getSalary() {
        return salary;
    }

    public Address getAddress() {
        return address;
    }
}
