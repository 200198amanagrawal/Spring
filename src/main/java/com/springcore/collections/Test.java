package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/collections/collectionConfig.xml");
        Employee employee=(Employee) ctx.getBean("employee1");
        System.out.println(employee);
        
        Bank bank=(Bank) ctx.getBean("bank1");
        System.out.println();
        System.out.println(bank);
        System.out.println("Employee within bank");
        System.out.println(bank.getEmployee());
        
        //bank2 which is a constructor based injected object
        Bank bank2=(Bank) ctx.getBean("bank2");
        System.out.println(bank2);
	}

}
