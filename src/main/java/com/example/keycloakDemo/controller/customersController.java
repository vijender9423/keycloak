package com.example.keycloakDemo.controller;

import com.example.keycloakDemo.models.Customer;
import org.apache.catalina.util.CustomObjectInputStream;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@Controller
public class customersController {

    @GetMapping(path = "/")
    public String index() {
        return "contact-us";
    }

    @GetMapping(path = "/customers")
    public String customers(Principal principal, Model model) {
        //addCustomers();
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("surender","gurgaon","ration"));
        customerList.add(new Customer("bijender","delhi","service"));
        model.addAttribute("customers", customerList);
        model.addAttribute("username", principal.getName());
        return "customers";
    }
}
