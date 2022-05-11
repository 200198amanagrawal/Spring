package com.springcore.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Value("ABC")
	private String name;

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
