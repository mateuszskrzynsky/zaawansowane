package pl.sda.mg.oop.abstraction;

public class AbstractionExampleApp {
    public static void main(String[] args) {
        CustomerRepository repository = new ExternalService();
        CustomerService customerService= new CustomerService(repository);

        String customerAddress = customerService.getCustomerAddress("kowalski");
        System.out.println(customerAddress);

    }
}
