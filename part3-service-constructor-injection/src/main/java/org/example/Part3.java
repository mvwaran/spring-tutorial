package org.example;

import org.example.components.Sport;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Part3 {
    public static void main( String[] args ) {
        // load spring config (applicationContext.xml) file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // retrieve bean from spring container and cast it to Sport
        Sport badminton = context.getBean("badmintonSport", Sport.class);
        Sport cricket = context.getBean("cricketSport", Sport.class);
        // call method on bean
        System.out.println("Output from Main file - " + badminton.getAccessories());
        System.out.println("Output from Main file - " + cricket.getAccessories());
        // close context
        context.close();
    }
}
