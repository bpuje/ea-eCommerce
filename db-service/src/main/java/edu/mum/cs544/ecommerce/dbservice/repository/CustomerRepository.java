package edu.mum.cs544.ecommerce.dbservice.repository;

import edu.mum.cs544.ecommerce.dbservice.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findByUserName(String username);
}
