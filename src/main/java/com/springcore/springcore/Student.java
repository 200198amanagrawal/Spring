package com.springcore.springcore;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
	private String studentId;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	public Student(String studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	private String studentName;
	private String studentAddress;
	
	@PostConstruct
	public void init()
	{
		System.out.println("Init called via annotation");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Destroy called via annotation");
	}
}
