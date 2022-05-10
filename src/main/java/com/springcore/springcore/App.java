package com.springcore.springcore;

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
        
        //Component annotation is used in employee class which does not require bean tag to be declared in config file 
        Employee employee=(Employee) ctx.getBean("ob",Employee.class);
        System.out.println(employee);
    }
}
