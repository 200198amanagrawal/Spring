package com.springcore.springcore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ob")
public class Employee {
	
	@Value("Aman")
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + "]";
	}
	
	@Value("VNS")
	private String city;
}
