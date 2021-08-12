package com.brane.form.mvc;
import java.util.LinkedHashMap;

import org.springframework.web.bind.annotation.ModelAttribute;

//We are going to use spring mvc form tag for data binding, 
//but first we need to create a Student class.

public class Student {

	//fields
	private String firstName;
	private String lastName;

	//drop-down list
	private String country;
	
	//drop-down list
	//read list of countries from a Java class
	//LinkedHashMap is collection of name value pairs <key, label>
	private LinkedHashMap<String, String> countryOptions;
	
	//field for radio button
	private String favoriteLanguage;
	
	//field for checkbox
	private String[] operatingSystems;
	
	
	
	//populate country options field with constructor
	public Student() {
		
		countryOptions=new LinkedHashMap<>();

		countryOptions.put("CUB", "Cuba");
		countryOptions.put("USA", "United States of America");
		countryOptions.put("SRB", "Serbia");
		countryOptions.put("BR", "Brasil");
		countryOptions.put("AUS", "Australia");
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
	//We are going to create here only getter method, so we can read country options.
	//We don't need a setter method here, because we will not change the data, only read.
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	
}
