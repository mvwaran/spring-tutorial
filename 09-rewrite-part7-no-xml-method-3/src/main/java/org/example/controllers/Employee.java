package org.example.controllers;

import org.example.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee implements Person {

    @Autowired
    @Qualifier("eveningService") // Default Name automatically matches EveningService class
    private GreetingService greetingService;

    public Employee() {
        System.out.println("Employee Constructor called");
    }

    @Override
    public String echo() {
        return greetingService.greet() + " I'm an employee";
    }
}
