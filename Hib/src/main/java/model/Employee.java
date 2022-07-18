package model;

import javax.persistence.*;


@Entity
@Table(name="emp")
public class Employee
{
	@Id
	@Column(name="id")
	int id;
	@Column(name="name")
	String name;
	@Column(name="email")
	String email;
	@Column(name="dept")
	String dept;
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}