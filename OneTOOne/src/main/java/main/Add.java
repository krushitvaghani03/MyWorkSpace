package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Student;
import model.Student_Details;

public class Add 
{
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration()
				.configure("resources/hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Student_Details.class)
				.buildSessionFactory();
		
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
//		Student_Details sd1 = new Student_Details();
//		sd1.setSd_fname("Bhingradiya");
//		sd1.setSd_lname("Savan");
//		
//		Student s1 = new Student();
//		s1.setEmail("Savan@gmail.com");
//		s1.setPass("123");
//		s1.setDetails(sd1);
		
//		Student_Details sd2 = new Student_Details();
//		sd2.setSd_fname("Tops");
//		sd2.setSd_lname("Technologies");
//		
//		Student s2 = new Student();
//		s2.setEmail("Tops@gmail.com");
//		s2.setPass("123");
//		s2.setDetails(sd2);
//		
		
		Student_Details sd = new Student_Details();
		sd.setSd_fname("Patel");
		sd.setSd_lname("Ramesh");
		
		Student s1 = new Student();
		s1.setEmail("Patel@gmail.com");
		s1.setPass("1234");
		s1.setDetails(sd);
		
		s.save(s1);
	//	s.save(s1);
	//	s.save(s2);
		tx.commit();
		
		
	}
}
