package com.springcore.collections;

public class Bank {
	
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
}
