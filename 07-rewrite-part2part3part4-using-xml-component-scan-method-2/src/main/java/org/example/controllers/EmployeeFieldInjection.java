package org.example.controllers;

import org.example.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // If no name specified bean name will camelcase of class name e.g. employeeFieldInjection
public class EmployeeFieldInjection implements Person {

    @Autowired
    private GreetingService greetingService;

    public EmployeeFieldInjection() {
        System.out.println("Employee Field Injection Constructor called");
    }

    @Override
    public String echo() {
        return greetingService.greet() + " I'm an employee from field injection";
    }
}
