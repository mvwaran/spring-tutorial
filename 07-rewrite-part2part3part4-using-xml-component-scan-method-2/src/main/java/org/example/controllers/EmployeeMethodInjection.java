package org.example.controllers;

import org.example.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("employeeMethodInjection")
public class EmployeeMethodInjection implements Person {

    private GreetingService greetingService;

    public EmployeeMethodInjection() {
        System.out.println("Employee Method Injection Constructor called");
    }

    @Autowired
    public void instantiateEmployeeInstance(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Override
    public String echo() {
        return greetingService.greet() + " I'm an employee from method injection";
    }
}
