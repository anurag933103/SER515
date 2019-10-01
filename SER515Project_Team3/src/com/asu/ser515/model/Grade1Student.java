package com.asu.ser515.model;

/**
 * Model class for the Grade 1 student. This class has all the properties 
 * associated with the student of grade 1. 
 * 
 * @author amanjotsingh
 * @date 09/25/2019
 * 
 * */

public class Grade1Student {

	private String firstName;
	private String lastName;
	
	// default constructor
	public Grade1Student() { }
	
	// class constructors
	public Grade1Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// getters and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
