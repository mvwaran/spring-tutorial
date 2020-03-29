package org.example.controllers;

import org.example.services.GreetingService;

public class Student implements Person {

    private GreetingService greetingService;

    public Student(GreetingService greetingService) {
        System.out.println("Student Constructor called");
        this.greetingService = greetingService;
    }

    @Override
    public String echo() {
        return greetingService.greet() + " I'm a student";
    }
}
