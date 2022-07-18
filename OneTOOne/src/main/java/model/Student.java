package model;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sid")
	int sid;
	@Column(name="email")
	String email;
	@Column(name="pass")
	String pass;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sd_id")
	Student_Details details;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
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

	public Student_Details getDetails() {
		return details;
	}

	public void setDetails(Student_Details details) {
		this.details = details;
	}
	
	
	
}
