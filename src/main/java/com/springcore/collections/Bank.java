package com.springcore.collections;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Bank implements InitializingBean,DisposableBean{
	
	@Override
	public String toString() {
		return "Bank [name=" + name + ", employee=" + employee + "]";
	}
	private String name;
	private Employee employee;
	public String getName() {
		return name;
	}
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(String name, Employee employee) {
		super();
		this.name = name;
		this.employee = employee;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	//lifecycle method which is abstract in DisposableBean
	public void destroy() throws Exception {
		System.out.println("Destroyed call");
		
	}
	
	//lifecycle method which is abstract in InitializingBean
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init called");
		
	}
}
