public class DependencyInjectionTest {
    public static void main(String[] args) {
        // Create the repository (concrete implementation)
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject the repository into the service
        CustomerService customerService = new CustomerService(customerRepository);

        // Use the service to find and display a customer
        customerService.findAndDisplayCustomer("12345");
    }
}
