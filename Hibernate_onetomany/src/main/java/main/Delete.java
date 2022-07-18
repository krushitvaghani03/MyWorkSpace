package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Category;
import model.Product;

public class Delete {
public static void main(String[] args) {
	
	SessionFactory sf = new Configuration()
			.configure("resources/hibernate.cfg.xml")
			.addAnnotatedClass(Category.class)
			.addAnnotatedClass(Product.class)
			.buildSessionFactory();
	
	Session s = sf.openSession();
	Transaction tx = s.beginTransaction();
	
	//Product p =  s.load(Product.class, 2);
	//s.delete(p);
	//tx.commit();
	
	Category ct =  s.load(Category.class, 2);
	s.delete(ct);
	tx.commit();
}
}
