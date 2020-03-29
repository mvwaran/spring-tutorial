package org.example.controllers;

import org.example.services.GreetingService;

public class Student implements Person {

    private String name;
    private GreetingService greetingService;

    public Student() {
        System.out.println("Student Constructor called");
    }

    @Override
    public String echo() {
        return greetingService.greet() + " I'm a student. My name is " + name;
    }

    public void setName(String name) {
        System.out.println("Student setName() called");
        this.name = name;
    }

    public void setGreetingService(GreetingService greetingService) {
        System.out.println("Student setGreetingService() called");
        this.greetingService = greetingService;
    }
}
