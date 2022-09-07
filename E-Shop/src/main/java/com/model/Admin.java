package com.model;

import javax.persistence.*;

@Entity
@Table(name = "admin")
public class Admin {

	@Id
	@Column(name = "adminId")
	int adminId;
	@Column(name = "adminEmail")
	String adminEmail;
	@Column(name = "adminPass")
	String adminPass;
	
	
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public String getAdminPass() {
		return adminPass;
	}
	public void setAdminPass(String adminPass) {
		this.adminPass = adminPass;
	}
	
	
}
