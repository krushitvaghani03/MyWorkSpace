package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Candidate;
import model.Course;

public class AddData {
public static void main(String[] args) {
	
	SessionFactory sf = new Configuration()
			.configure("resources/hibernate.cfg.xml")
			.addAnnotatedClass(Candidate.class)
			.addAnnotatedClass(Course.class)
			.buildSessionFactory();
	
	Session s = sf.openSession();
	Transaction tx = s.beginTransaction();
	
//	Course c = new Course();
//	c.setCname("Java");
//	
//	Candidate cs = new Candidate();
//	cs.setCaname("Jaimeen");
//	cs.addCourse(c);
	
//	Candidate c1 = new Candidate();
//	c1.setCaname("Laxman");
//	
//	Candidate c2 = new Candidate();
//	c2.setCaname("Savan");
//	
//	Course c = new Course();
//	c.setCname("Python");
//	c.addCandidate(c1);
//	c.addCandidate(c2);
	

Course cs1 = new Course();
	cs1.setCname("PHP");
	
	Course cs2 = new Course();
	cs2.setCname("Android");
	
	Candidate c1 = new Candidate();
	c1.setCaname("Ramesh");
	c1.addCourse(cs1);
	c1.addCourse(cs2);

	
	
	s.save(cs1);
	s.save(cs2);
	s.save(c1);
	tx.commit();
	
	
}
}
