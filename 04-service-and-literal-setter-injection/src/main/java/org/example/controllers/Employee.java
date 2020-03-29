package org.example.controllers;

import org.example.services.GreetingService;

public class Employee implements Person {

    private String name;
    private GreetingService greetingService;

    public Employee() {
        System.out.println("Employee Constructor called");
    }

    @Override
    public String echo() {
        return greetingService.greet() + " I'm an employee. My name is " + name;
    }

    public void setName(String name) {
        System.out.println("Employee setName() called");
        this.name = name;
    }

    public void setGreetingService(GreetingService greetingService) {
        System.out.println("Employee setGreetingService() called");
        this.greetingService = greetingService;
    }
}
