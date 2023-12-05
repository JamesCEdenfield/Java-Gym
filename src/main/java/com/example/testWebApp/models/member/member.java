package com.example.testWebApp.models.member;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class member {
		
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String fName;
	@Column
	private String lName;
	@Column
	private int age;
	
	
	
//	private int gymID;
//	private LocalDate joinDate;
//	private LocalDate lastVisit;
//	
	
	//constructors
	public member(Long id, String fName, String lName, int age, int gymID, LocalDate joinDate, LocalDate lastVisit) {
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.age = age;
//		this.gymID = gymID;
//		this.joinDate = joinDate;
//		this.lastVisit = lastVisit;
	}
	
	public member(String fName, String lName, int age, int gymID, LocalDate joinDate, LocalDate lastVisit) {
		this.fName = fName;
		this.lName = lName;
		this.age = age;
//		this.gymID = gymID;
//		this.joinDate = joinDate;
//		this.lastVisit = lastVisit;
	}
	
	public member() {
		
	}
	
	public Long getID() {
		return this.id;
	}
	
	public void setID(Long id) {
		this.id = id;
	}
	
	public String getFname() {
		return this.fName;
	}
	
	public void setFname(String fName) {
		this.fName = fName;
	}
	
	public String getLname() {
		return this.lName;
	}
	
	public void setLname(String lName) {
		this.lName = lName;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
//	
//	public int getGymID() {
//		return this.gymID;
//	}
//	
//	public void setGymID(int gymID) {
//		this.gymID = gymID;
//	}
//	
//	public LocalDate getJoinDate() {
//		return this.joinDate;
//	}
//	
//	public void setJoinDate(LocalDate joinDate) {
//		this.joinDate = joinDate;
//	}
//	
//	public LocalDate getLastVisit() {
//		return this.lastVisit;
//	}
//	
//	public String toString() {
//		return "{"
//                + "\"id\":" + id
//                + ", \"firstName\":\"" + fName + "\""
//                + ", \"lastName\":\"" + lName + "\""
//                + ", \"age\":" + age
//                + ", \"gymID\":" + gymID
//                + ", \"joinDate\":\"" + joinDate + "\""
//                + ", \"lastVisit\":\"" + lastVisit + "\""
//                + "}";
//	}
//
//	
//	
	
	
	
	
	
}
