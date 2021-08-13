package com.brane.form.mvc;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//ADDING VALIDATION RULES
public class Customer {

	private String firstName;
	
	//Can't have null value and must have min 1 char
	@NotNull(message="is required!")
	@Size(min=1,message="is required!")
	private String lastName;
	
	//validating a number range 0-10
	//Integer can have null value, int can't
	//private int freePasses;
	@NotNull(message="is required!")
	@Min(value=0,message="Mustbe greater than or equal to zero")
	@Max(value=10,message="Must be less than or equal to 10")
	private Integer freePasses;
	
	
	
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
	
	//getter and setter for freePasses field
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	
}
