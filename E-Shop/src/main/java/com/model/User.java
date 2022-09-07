package com.model;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Size(min = 1,message = "Firstname Required!!")
	String fname;
	
	@Size(min = 1,message = "Lastname Required!!")
	String lname;
	
	@Email
	@Pattern(regexp="\"^([a-zA-Z0-9\\\\-\\\\.\\\\_]+)'+'(\\\\@)([a-zA-Z0-9\\\\-\\\\.]+)'+'(\\\\.)([a-zA-Z]{2,4})$",message = "enter correct email")
	String email;
	
	//@Pattern(regexp = "^((?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$&*])(?=.*[0-9])){4,12}$", message = "password must contain atleast 1 uppercase, 1 lowercase, 1 special character and 1 digit ")
	 @Pattern(regexp="^[a-zA-Z0-9]{3}",message="length must be 3")  
	String pass;
	
	@NonNull
	@Size(max = 10,message = "enter correct mobile")
	String phno;

	@ManyToMany(mappedBy = "users")
	List<Shopcart> shopcarts;
	
public int getId() {
	return id;
}

	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	
}
