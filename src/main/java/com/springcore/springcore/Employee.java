package com.springcore.springcore;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ob")
public class Employee {
	
	@Value("Aman")
	private String name;
	
	@Value("#{temp}")
	private List<String> iplTeamList;
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
	
	public Employee(String name, List<String> iplTeamList, String city) {
		super();
		this.name = name;
		this.iplTeamList = iplTeamList;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", iplTeamList=" + iplTeamList + ", city=" + city + "]";
	}
	public List<String> getIplTeamList() {
		return iplTeamList;
	}
	public void setIplTeamList(List<String> iplTeamList) {
		this.iplTeamList = iplTeamList;
	}

	@Value("VNS")
	private String city;
}
