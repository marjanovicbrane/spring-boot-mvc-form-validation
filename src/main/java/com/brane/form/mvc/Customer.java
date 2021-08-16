package com.brane.form.mvc;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.brane.form.validation.CourseCode;

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
	
	
	//We are using here regular expressions.
	//User can only enter 5 chars/digits.
	@Pattern(regexp="^[a-y-zA-Z0-9]{5}",message="only 5 chars/digits")
	private String postalCode;
	
	//This is our custom rule, our custom CourseCode annotation.
	//If we don't enter anything it will be DEV value and message Must start with DEV by default.
	//Course code must starts with SPACEX...
	@CourseCode(value="SPACEX", message="Must start with SPACEX")
	private String courseCode;
	
	
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
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
}
