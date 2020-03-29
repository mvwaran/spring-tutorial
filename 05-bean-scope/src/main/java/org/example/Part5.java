package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Part5 {
    public static void main( String[] args ) {
        // load spring config (applicationContext.xml) file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // retrieve bean from spring container
        ClassA classA1 = context.getBean("classA", ClassA.class);
        ClassA classA2 = context.getBean("classA", ClassA.class);
        ClassA classA3 = context.getBean("classA", ClassA.class);
        ClassA classA4 = context.getBean("classA", ClassA.class);
        ClassA classA5 = context.getBean("classA", ClassA.class);
        ClassB classB1 = context.getBean("classB", ClassB.class);
        ClassB classB2 = context.getBean("classB", ClassB.class);
        ClassB classB3 = context.getBean("classB", ClassB.class);
        ClassB classB4 = context.getBean("classB", ClassB.class);
        ClassB classB5 = context.getBean("classB", ClassB.class);
        // close context
        context.close();
    }
}
