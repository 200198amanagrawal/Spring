package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
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
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        ctx.registerShutdownHook();
        Student student=(Student) ctx.getBean("student1");
        System.out.println(student);
    }
}
