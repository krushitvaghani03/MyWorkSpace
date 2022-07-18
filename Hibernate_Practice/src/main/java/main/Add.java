package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Employee;

public class Add 
{
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration()
				.configure("resources/hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Employee e  = new Employee();
		e.setEmail("tops@gmail.com");
		e.setPass("123");
		
		s.save(e);
		tx.commit();
		
	}
}
