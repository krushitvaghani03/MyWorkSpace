package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Student;
import model.Student_Details;

public class Delete {
public static void main(String[] args) {
	
	SessionFactory sf = new Configuration()
			.configure("resources/hibernate.cfg.xml")
			.addAnnotatedClass(Student.class)
			.addAnnotatedClass(Student_Details.class)
			.buildSessionFactory();
	
	Session s = sf.openSession();
	Transaction tx = s.beginTransaction();
//	
//	Student_Details sd = s.load(Student_Details.class, 2);
//	s.delete(sd);
	
	Student s1 = s.load(Student.class,1);
	s.delete(s1);
	
	tx.commit();
}
}
