package main;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Employee;

public class Get {

	public static void main(String[] args) {
		
		
		SessionFactory sf = new Configuration()
				.configure("resources/hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
//		List<Employee> x = s.createQuery("from Employee").list();
//		
//		for(Employee e : x)
//		{
//			System.out.println(e.getId()+" "+e.getEmail()+" "+e.getPass());
//		}
		
//	Query q = s.createQuery("from Employee");
//	q.setFirstResult(1);
//	q.setMaxResults(3);
//	List<Employee> x = q.getResultList();
//	
//	for(Employee e : x)
//	{
//		System.out.println(e.getId()+" "+e.getEmail()+" "+e.getPass());
//	}
	
		
//		Query q = s.createQuery("update Employee set email=:e where id=:i");
//		q.setParameter("e", "tops1@gmail.com");
//		q.setParameter("i", 1);
//		
//		int x = q.executeUpdate();
//		System.out.println(x);
		
//		Query q = s.createQuery("update Employee set email=:e , pass=:p where id=:i");
//		q.setParameter("e", "xyz@gmail.com");
//		q.setParameter("p", "xyz");
//		q.setParameter("i", 2);		
//		
//		int x = q.executeUpdate();
		
//		Query q = s.createQuery("delete from Employee where id=:i");
//		q.setParameter("i", 2);
//		
//		q.executeUpdate();
		
//		Query  q = s.createQuery("select sum(salary) from Employee");
//		
//		List<Integer> l = q.getResultList();
//		System.out.println(l.get(0));
	
//		Query q = s.createQuery("SELECT SUM(E.salary), E.email FROM Employee E " +
//	             "GROUP BY E.email");
//		List<Employee> x = q.getResultList();
//		
//		for(Employee a : x)
//		{
//			System.out.println(a.getId()+" "+a.getEmail()+" "+a.getPass()+" "+a.getSalary());
//		}
		

		Query q = s.createQuery("from Employee E where E.id =: emp_id");
		q.setParameter("emp_id", 2);
		
		List<Employee> e = q.getResultList();
		
		System.out.println(e.get(2));
		
		//tx.commit();
			
		
	}
}
