package com.springcore;

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
        System.out.println( "Hello Spring" );
        ApplicationContext context=new ClassPathXmlApplicationContext("configue.xml");
        
        Student student=(Student)context.getBean("student");
        System.out.println(student);
    }
}
