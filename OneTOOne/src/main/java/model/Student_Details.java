package model;

import javax.persistence.*;

@Entity
@Table(name="student_details")
public class Student_Details {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sd_id")
	int sd_id;
	@Column(name="sd_fname")
	String sd_fname;
	@Column(name="sd_lname")
	String sd_lname;
	
	@OneToOne(mappedBy = "details",cascade = CascadeType.ALL)
	Student student;

	public int getSd_id() {
		return sd_id;
	}

	public void setSd_id(int sd_id) {
		this.sd_id = sd_id;
	}

	public String getSd_fname() {
		return sd_fname;
	}

	public void setSd_fname(String sd_fname) {
		this.sd_fname = sd_fname;
	}

	public String getSd_lname() {
		return sd_lname;
	}

	public void setSd_lname(String sd_lname) {
		this.sd_lname = sd_lname;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	

}
