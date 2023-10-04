package pl.sda.mg.oop.abstraction;

public class ExternalService implements CustomerRepository{
    @Override
    public String fetchCustomerAddress(String lastName) {
        return String.format("Customer %s address from database: Łudź, Marszałkowska 1",lastName);
    }

    @Override
    public void addCustomer(String lastName) {

    }
}
