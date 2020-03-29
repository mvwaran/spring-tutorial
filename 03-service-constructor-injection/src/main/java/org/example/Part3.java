package org.example;

import org.example.controllers.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Part3 {
    public static void main( String[] args ) {
        // load spring config (applicationContext.xml) file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // retrieve bean from spring container and cast it to Person
        Person employee = context.getBean("employee", Person.class);
        Person student = context.getBean("student", Person.class);
        // call method on bean
        System.out.println("Output from Main file - " + employee.echo());
        System.out.println("Output from Main file - " + student.echo());
        // close context
        context.close();
    }
}
