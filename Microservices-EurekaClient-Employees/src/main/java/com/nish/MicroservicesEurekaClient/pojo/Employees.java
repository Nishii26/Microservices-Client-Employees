package com.nish.MicroservicesEurekaClient.pojo;

import java.sql.Timestamp;

public class Employees {

	 private Integer   id;
	 private String    name;
	 private String    email;
	 private String    department;
	 private String    gender;
	 private String    username;
	 private String    password;
	 private String    userType;
	 
	public Employees(Integer id, String name,String email,String department,String gender,String username, String password, String userType) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.department = department;
		this.gender = gender;
		this.username = username;
		this.password = password;
		this.userType = userType;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
}
