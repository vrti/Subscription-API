/**
 * 
 */
package com.example.modal;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * @author vartika.gupta
 *
 */
public class Subscription {

	String id;
	
	@NotBlank(message = "Name cannot be blank")
	String name;
	
	@Email(message = "Please enter valid email address")
	String email;
	
	@NotBlank(message = "user type cannot be blank")
	String userType;
	
	@NotBlank(message = "company cannot be blank")
	String company;
	
	@NotBlank(message = "application type cannot be blank")
	String applicationType;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
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
	
	public String getUserType() {
		return userType;
	}
	
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getApplicationType() {
		return applicationType;
	}
	
	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}
}
