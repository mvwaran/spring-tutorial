package org.example.controllers;

import org.example.services.GreetingService;

public class Employee implements Person {

    private GreetingService greetingService;

    public Employee(GreetingService greetingService) {
        this.greetingService = greetingService;
        System.out.println("Employee Constructor called");
    }

    @Override
    public String echo() {
        return greetingService.greet() + " I'm an employee";
    }
}
