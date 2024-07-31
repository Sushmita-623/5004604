public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(String id) {
        // Simulate a database fetch
        if ("123".equals(id)) {
            return "John Doe";
        } else {
            return "Customer not found";
        }
    }
}
