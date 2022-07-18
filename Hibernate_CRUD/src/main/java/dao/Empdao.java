package dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Employee;

public class Empdao 
{
	SessionFactory sf;
	public Empdao() {
	
		 sf = new Configuration()
				.configure("resources/hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
	}
	public void addEmp(Employee e) {

		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.saveOrUpdate(e);
		tx.commit();
		s.close();
		
	}
	public ArrayList<Employee> getAllEmp() {
		
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		
		return (ArrayList<Employee>) s.createQuery("from Employee").list();
	}
	public void deletEmp(int id) {

		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Employee emp =  s.get(Employee.class, id);
		s.delete(emp);
		tx.commit();
		s.close();
	}
	public Employee getDataById(int id) {
		
		Session s =  sf.openSession();
		Transaction tx = s.beginTransaction();
		Employee emp =  s.get(Employee.class, id);
		
		return emp;
	}
}
