package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Part2 {
    public static void main( String[] args ) {
        // load spring config (applicationContext.xml) file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // retrieve bean from spring container and cast it to Sport
        Sport sport = context.getBean("sport", Sport.class);
        // call method on bean
        System.out.println(sport.getAccessories());
        // close context
        context.close();
    }
}
