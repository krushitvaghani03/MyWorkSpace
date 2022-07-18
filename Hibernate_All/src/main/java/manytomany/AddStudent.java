package manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Course;
import model.Instructor;
import model.Instructor_Details;
import model.Student;

public class AddStudent {
public static void main(String[] args) {
	
	SessionFactory sf = new Configuration()
			.configure("resources/hibernate.cfg.xml")
			.addAnnotatedClass(Instructor.class)
			.addAnnotatedClass(Instructor_Details.class)
			.addAnnotatedClass(Course.class)
			.addAnnotatedClass(Student.class)
			.buildSessionFactory();

	Session s = sf.openSession();
	Transaction tx = s.beginTransaction();
	
//	Student s1 = new Student();
//	s1.setSname("Hardik");
//	
//	Student s2 = new Student();
//	s2.setSname("Parth");
//	
//	Course c = s.load(Course.class, 3);
//	
//	s1.addCourse(c);
//	s2.addCourse(c);
//	
//	s.save(s1);
//	s.save(s2);
//	tx.commit();
	
	Instructor i = s.load(Instructor.class, 4);
	
	Student s1 = s.load(Student.class, 3);
	
	Course c = new Course();
	c.setCname("Android");
	c.setInstructor(i);
	c.addStudent(s1);
	
	s.save(c);
	tx.commit();
	
	
	
	
}
}
