package com.sunita.spring;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;  

public class User {
	@NotEmpty
	private String username;  
    @Size(min=8,message="required")  
    private String password; 
    @NotEmpty
    @Email
    private String email;
    @Range(min = 10, max = 12) 
    private int contact;
    private String city;
    private int zip;
      
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
    public int getZip() {  
        return zip;  
    }  
    public void setZip(int zip) {  
        this.zip = zip;  
    }
    

}
