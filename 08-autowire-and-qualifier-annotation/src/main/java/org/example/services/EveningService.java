package org.example.services;

import org.springframework.stereotype.Component;

@Component
public class EveningService implements GreetingService {
    @Override
    public String greet() {
        return "Good Evening!";
    }
}
