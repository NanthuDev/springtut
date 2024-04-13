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
      //  vehicle obj =(vehicle)context.getBean("bike");
      //  vehicle obj =(vehicle)context.getBean("car");
       // obj.drive();
        
        
        
       // Tyre t = new Tyre();
       //Instead of creating the instance, get it from bean.
        Tyre t = (Tyre) context.getBean("tyre");
       System.out.println(t);
    }
}
