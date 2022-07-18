package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Student;
import model.Student_Details;

public class View {
public static void main(String[] args) {
	SessionFactory sf = new Configuration()
			.configure("resources/hibernate.cfg.xml")
			.addAnnotatedClass(Student.class)
			.addAnnotatedClass(Student_Details.class)
			.buildSessionFactory();
	
	Session s = sf.openSession();
	Transaction tx = s.beginTransaction();
	
	Student s1 = s.load(Student.class, 3);
	
	System.out.println(s1.getDetails().getSd_fname()+" "+s1.getDetails().getSd_lname()+" "+s1.getEmail()+" "+s1.getPass());
}
}
