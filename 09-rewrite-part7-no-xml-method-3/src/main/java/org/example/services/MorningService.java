package org.example.services;

import org.springframework.stereotype.Component;

@Component
public class MorningService implements GreetingService {

    public MorningService() {
        System.out.println("Morning Service constructor");
    }

    @Override
    public String greet() {
        return "Good Morning!";
    }
}
