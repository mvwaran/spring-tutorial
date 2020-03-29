package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Part2 {
    public static void main( String[] args ) {
        // load spring config (applicationContext.xml) file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // retrieve bean from spring container and cast it to Sport
        Person student = context.getBean("student", Person.class);
        Person employee = context.getBean("employee", Person.class);
        // call method on bean
        System.out.println(student.echo());
        System.out.println(employee.echo());
        // close context
        context.close();
    }
}
