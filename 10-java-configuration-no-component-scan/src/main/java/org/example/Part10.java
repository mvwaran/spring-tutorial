package org.example;

import org.example.controllers.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Part10 {
    public static void main( String[] args ) {
        // load spring config (applicationContext.xml) file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        // retrieve bean from spring container and cast it to Person
        Person employee = context.getBean("employee", Person.class);
        // call method on bean
        System.out.println("Output from Main file - " + employee.echo());
        // close context
        context.close();
    }
}
