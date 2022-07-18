package onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.criteria.internal.expression.function.AggregationFunction.COUNT;

import model.Course;
import model.Instructor;
import model.Instructor_Details;

public class AddCourse {
public static void main(String[] args) {
	
	SessionFactory sf = new Configuration()
			.configure("resources/hibernate.cfg.xml")
			.addAnnotatedClass(Instructor.class)
			.addAnnotatedClass(Instructor_Details.class)
			.addAnnotatedClass(Course.class)
			.buildSessionFactory();

	Session s = sf.openSession();
	Transaction tx = s.beginTransaction();
	
//	Instructor_Details id = new Instructor_Details();
//	id.setInsd_channel("Java");
//	
//	Instructor i = new Instructor();
//	i.setIns_name("Ramesh");
//	i.setInstructor_Details(id);
//	
//	Course c = new Course();
//	c.setCname("Core");
//	Course c1 = new Course();
//	c1.setCname("Advance");
//	
//	i.addCourse(c);
//	i.addCourse(c1);
//	
//	s.save(c);
//	s.save(c1);
//	s.save(i);
//	tx.commit();
	
	
	Instructor i = s.load(Instructor.class, 1);
	
//	Course c = new Course();
//	c.setCname("Inheritence");
//	c.setInstructor(i);
	
	Course c1 = new Course();
	c1.setCname("Encapsulation");
	c1.setInstructor(i);
	
	//s.save(c);
	s.save(c1);
	tx.commit();
	
	
	
	
	
}
}
