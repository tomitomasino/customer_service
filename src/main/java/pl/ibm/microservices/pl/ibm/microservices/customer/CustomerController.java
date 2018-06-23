package pl.ibm.microservices.pl.ibm.microservices.customer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @RequestMapping("/customers")
    public Customer getCustomers(){
        return new Customer();
    }
}
