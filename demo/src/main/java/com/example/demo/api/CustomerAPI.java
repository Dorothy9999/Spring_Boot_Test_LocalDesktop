package com.example.demo.api;
import com.example.demo.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

@RestController
@RequestMapping("/customer")
public class CustomerAPI {

    @GetMapping
    public Customer getCustomer() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = format.format(new Date());
        Customer customer = new Customer("Test", dateTime);
        return customer;
    }

}
