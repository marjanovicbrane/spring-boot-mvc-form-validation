package com.brane.form.mvc;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//ADDING VALIDATION RULES
public class Customer {

	private String firstName;
	
	//Can't have null value and must have min 1 char
	@NotNull(message="is required!")
	@Size(min=1,message="is required!")
	private String lastName;
	
	
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
