package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Category;
import model.Product;

public class Add 
{
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration()
				.configure("resources/hibernate.cfg.xml")
				.addAnnotatedClass(Category.class)
				.addAnnotatedClass(Product.class)
				.buildSessionFactory();
		
		Category ct = new Category();
		ct.setcName("Electronics");
		
		Product p = new Product();
		p.setpName("Fan");
		p.setPrice(1000);
		p.setCategory(ct);
		
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		s.save(ct);
		s.save(p);
		tx.commit();
		
	}
}
