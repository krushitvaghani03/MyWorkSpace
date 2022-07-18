package main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Candidate;
import model.Course;

public class ViewData {
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration()
				.configure("resources/hibernate.cfg.xml")
				.addAnnotatedClass(Candidate.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
//	    Course c =	s.load(Course.class, 2);
//	    System.out.println(c.getCid()+" "+c.getCname());
//	    for(Candidate ct : c.getCandidates())
//	    {
//	    	System.out.println(ct.getCaid()+" "+ct.getCaname());
//
//		}

//		Candidate ct = s.load(Candidate.class, 3);
//		System.out.println(ct.getCaid()+" "+ct.getCaname());
//		for(Course c : ct.getCourses())
//		{
//			System.out.println(c.getCid()+" "+c.getCname());
//		}
		
//	List<Course> cs =	s.createQuery("from Course").list();
//	
//	for(Course c : cs)
//	{
//		System.out.println(c.getCid()+" "+c.getCname());
//		for(Candidate ca : c.getCandidates())
//		{
//			System.out.println(ca.getCaid()+" "+ca.getCaname());
//		}
//	}
		
		List<Candidate> ca = s.createQuery("from Candidate").list();
		for(Candidate c : ca)
		{
			System.out.println(c.getCaid()+" "+c.getCaname());
			System.out.println("Courses : ");

			for(Course cs : c.getCourses())
			{
				System.out.println(cs.getCname());
			}
			System.out.println();	
			}
	}

}
