package org.example;

import org.example.controllers.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Part7 {
    public static void main( String[] args ) {
        // load spring config (applicationContext.xml) file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // retrieve bean from spring container and cast it to Person
        Person employeeConstructorInjection = context.getBean("employeeConstructorInjection", Person.class);
        Person employeeMethodInjection = context.getBean("employeeMethodInjection", Person.class);
        Person employeeFieldInjection = context.getBean("employeeFieldInjection", Person.class);
        // call method on bean
        System.out.println("Output from Main file - " + employeeConstructorInjection.echo());
        System.out.println("Output from Main file - " + employeeMethodInjection.echo());
        System.out.println("Output from Main file - " + employeeFieldInjection.echo());
        // close context
        context.close();
    }
}
