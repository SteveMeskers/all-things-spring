package sm.springframework.spring_7_rest_mvc.services;

import java.util.List;
import java.util.UUID;

import sm.springframework.spring_7_rest_mvc.model.Customer;

public interface CustomerService {
    List<Customer> listCustomers();
    Customer getCustomerById(UUID id);
    Customer addCustomer(Customer customer);
    void updateCustomerById(UUID customerId, Customer customer);
    void deleteCustomerById(UUID customerId);
    void patchCustomer(UUID customerId, Customer customer);
}
