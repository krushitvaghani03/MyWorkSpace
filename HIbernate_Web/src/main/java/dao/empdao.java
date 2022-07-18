package dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Employee;

public class empdao {
	SessionFactory sf;
	public empdao()
	{
		   sf = new Configuration()
				.configure("resources/hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
	}

	public void addemp(Employee e) {

		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.saveOrUpdate(e);
		tx.commit();
		s.close();
	}

	public ArrayList<Employee> getallemp() {
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		return (ArrayList<Employee>) s.createQuery("from Employee").list();
	}

}
