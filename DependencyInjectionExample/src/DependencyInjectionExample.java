public class DependencyInjectionExample {
    public static void main(String[] args) {
        // Create an instance of CustomerRepository
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Create an instance of CustomerService with dependency injection
        CustomerService customerService = new CustomerService(customerRepository);

        // Use the CustomerService to find a customer
        String customerName = customerService.getCustomerName("123");
        System.out.println("Customer Name: " + customerName);

        // Use the CustomerService to find a non-existing customer
        customerName = customerService.getCustomerName("999");
        System.out.println("Customer Name: " + customerName);
    }
}
