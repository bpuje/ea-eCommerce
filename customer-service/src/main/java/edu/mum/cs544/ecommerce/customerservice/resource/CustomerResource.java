package edu.mum.cs544.ecommerce.customerservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerResource {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getCustomer/{customerUsername}")
    public List getCustomerByUsername(@PathVariable("customerUsername") String customerUsername){
        return restTemplate.getForObject("http://localhost:5001/db/customer" + customerUsername, List.class);
    }
}
