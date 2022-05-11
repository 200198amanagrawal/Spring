package com.springcore.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.springcore.Employee;
import com.springcore.springcore.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        Person person=ctx.getBean("person",Person.class);
        System.out.println(person);
    }
}
