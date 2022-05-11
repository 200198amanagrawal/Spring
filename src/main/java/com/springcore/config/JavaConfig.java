package com.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//annotation which will make this class equivalent to a .xml config file
@Configuration
@ComponentScan(basePackages = "com.springcore.config")
public class JavaConfig {
	
//one way to create a bean
//	
//	@Bean
//	public Person getPerson()
//	{
//		return new Person("DEF");
//	}
}
