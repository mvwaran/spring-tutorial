package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Part6 {
    public static void main( String[] args ) {
        // load spring config (applicationContext.xml) file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // retrieve bean from spring container
        Sample sample = context.getBean("sample", Sample.class);
        sample.sayHello();
        // close context
        context.close();
    }
}
