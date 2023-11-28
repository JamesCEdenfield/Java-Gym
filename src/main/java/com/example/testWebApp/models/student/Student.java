package com.example.testWebApp.models.student;

import java.time.LocalDate;

public class Student {
	private Long id;
	private String name;
	private String email;
	private int age;
	private LocalDate dob;
	
	public Student() {}
	
	public Student (Long id, String name, String email,int age, LocalDate dob) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.dob = dob;
	}
	
	public Student (String name, String email,int age, LocalDate dob) {
		this.name = name;
		this.email = email;
		this.age = age;
		this.dob = dob;
	}
	
	public Long getID() {
		return this.id;
	}
	public void setID(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public LocalDate getDOB() {
		return this.dob;
	}
	
	public void setDOB(LocalDate dob) {
		this.dob = dob;
	}
	
	public String toString() {
		return "Student{id= " + id + ","
				+ " name=" + name + ","
						+ " email= " + email + ","
								+ " age= " + age + ","
										+ " dob= "+ dob +" }";
	}
	
}
