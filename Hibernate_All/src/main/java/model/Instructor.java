package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "instructor")
public class Instructor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ins_id")
	int ins_id;
	@Column(name = "ins_name")
	String ins_name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "insd_id")
	Instructor_Details instructor_Details;
	
	@OneToMany(mappedBy = "instructor",cascade = CascadeType.ALL)
	List<Course> courses;

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public int getIns_id() {
		return ins_id;
	}

	public void setIns_id(int ins_id) {
		this.ins_id = ins_id;
	}

	public String getIns_name() {
		return ins_name;
	}

	public void setIns_name(String ins_name) {
		this.ins_name = ins_name;
	}

	public Instructor_Details getInstructor_Details() {
		return instructor_Details;
	}

	public void setInstructor_Details(Instructor_Details instructor_Details) {
		this.instructor_Details = instructor_Details;
	}
	
	public void addCourse(Course tempCourse)
	{
		if(courses==null)
		{
			courses = new ArrayList<Course>();
		}
		courses.add(tempCourse);
		
		tempCourse.setInstructor(this);
	}
	
	

}
