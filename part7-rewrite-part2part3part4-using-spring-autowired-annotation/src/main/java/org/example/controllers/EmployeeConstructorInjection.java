package org.example.controllers;

import org.example.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("employeeConstructorInjection")
public class EmployeeConstructorInjection implements Person {

    private GreetingService greetingService;

    @Autowired
    public EmployeeConstructorInjection(GreetingService greetingService) {
        this.greetingService = greetingService;
        System.out.println("Employee Constructor Injection Constructor called");
    }

    @Override
    public String echo() {
        return greetingService.greet() + " I'm an employee  from constructor injection";
    }
}
