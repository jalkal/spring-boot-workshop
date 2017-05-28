package com.jalkal.noboot.rest;

import com.jalkal.noboot.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController
{
    @Autowired
    CustomerRepository customerRepository;
    @RequestMapping("/")
    public String home(Model model)
    {
        model.addAttribute("customers", customerRepository.findAll());
        return "index";
    }
}
