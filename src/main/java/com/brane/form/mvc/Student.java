package com.brane.form.mvc;
import java.util.LinkedHashMap;

import org.springframework.web.bind.annotation.ModelAttribute;

//We are going to use spring mvc form tag for data binding, 
//but first we need to create a Student class.

public class Student {

	//fields
	private String firstName;
	private String lastName;

	
	
	public Student() {
		
	}

	//getters and setters
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
