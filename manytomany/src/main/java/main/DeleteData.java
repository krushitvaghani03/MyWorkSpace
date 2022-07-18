package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Candidate;
import model.Course;

public class DeleteData {
public static void main(String[] args) {
	SessionFactory sf = new Configuration()
			.configure("resources/hibernate.cfg.xml")
			.addAnnotatedClass(Candidate.class)
			.addAnnotatedClass(Course.class)
			.buildSessionFactory();
	
	Session s = sf.openSession();
	Transaction tx = s.beginTransaction();
	
//	Course c = s.load(Course.class, 2);
	
	Candidate c = s.load(Candidate.class, 4);
	Candidate c1 = s.load(Candidate.class, 5);

	s.delete(c);
	s.delete(c1);
	tx.commit();
}
}
