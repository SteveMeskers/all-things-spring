package sm.springframework.spring_7_rest_mvc.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import sm.springframework.spring_7_rest_mvc.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {

}
