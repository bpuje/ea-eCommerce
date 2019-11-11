package edu.mum.cs544.ecommerce.dbservice.resource;

import edu.mum.cs544.ecommerce.dbservice.model.Customer;
import edu.mum.cs544.ecommerce.dbservice.repository.CustomerServiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/db/customer")
public class CustomerResource {

    @Autowired
    CustomerServiceRepo customerRepository;

    @PostMapping("/save")
    public void saveUser(@RequestBody Customer customer){
        customerRepository.save(customer);
    }

    @GetMapping("{userName}")
    public List<String> getCustomerByUserName(@PathVariable("userName")String userName){
        List<Customer> customerList = customerRepository.findByUserName(userName);
        List<String> custName = new ArrayList<String>();
        for(Customer customer : customerList){
            custName.add(customer.getFullName());
        }
        return custName;
    }

    @GetMapping("/getAllCustomer") // maybe not use
    public List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }
}
