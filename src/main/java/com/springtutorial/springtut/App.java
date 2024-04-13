package com.springtutorial.springtut;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       // Bike obj = new Bike();
        //obj.drive();
        
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        vehicle obj =(vehicle)context.getBean("vehicle");
        obj.drive();
    }
}
