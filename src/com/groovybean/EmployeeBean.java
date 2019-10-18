package com.groovybean;

import java.io.Serializable;

//Java bean
public class EmployeeBean implements Serializable {
	
	//private properties
	private String firstName;
	private String secondName;
	private String email;
	
	//public no-arg constructor
	public EmployeeBean() {}

	//getters/setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "EmployeeBean [firstName=" + firstName + ", secondName=" + secondName + ", email=" + email + "]";
	}

}
