package org.example;

import org.example.controllers.Employee;
import org.example.services.GreetingService;
import org.example.services.MorningService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public GreetingService greetingService() {
        return new MorningService();
    }

    @Bean
    public Employee employee() {
        Employee employeeDetail = new Employee(greetingService());
        return employeeDetail;
    }
}
