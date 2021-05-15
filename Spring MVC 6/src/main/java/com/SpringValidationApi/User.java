package com.SpringValidationApi;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

public class User {

	
	private String userName;
    @Size(min=1,message="required")  
	private String password;
    @Size(min=8,message="required")  
	private String email;
	 @Min(value=10, message="Enter the email")  
	private int contact;
	 @Min(value=18, message="must be equal or greater than 18")  
	private String city;
	private int zipCode;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
	
	
	
}
