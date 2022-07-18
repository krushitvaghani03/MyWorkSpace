package main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Category;
import model.Product;

public class GetAllProduct {
public static void main(String[] args) {
	
	SessionFactory sf = new Configuration()
			.configure("resources/hibernate.cfg.xml")
			.addAnnotatedClass(Category.class)
			.addAnnotatedClass(Product.class)
			.buildSessionFactory();
	
	Session s = sf.openSession();
	Transaction tx = s.beginTransaction();
	
//	List<Category> cat = s.createQuery("from Category").list();
//	for (Category category : cat)
//	{
//		System.out.println(category.getcId()+" "+category.getcName());
//		for (Product p: category.getProduct()) {
//			
//			System.out.println(p.getpId()+" "+p.getpName()+" "+p.getPrice());
//		}
//		
//	}
	
//	Category cat =  s.load(Category.class, 1);
//	System.out.println(cat.getcId()+" "+cat.getcName());
//	
//	for (Product p : cat.getProduct()) {
//		System.out.println(p.getpId()+" "+p.getpName()+" "+p.getPrice());
//	}
	
	Product p = s.load(Product.class, 1);
	System.out.println(p.getpId()+" "+p.getpName()+" "+p.getPrice()+" "+p.getCategory().getcName());
	
}
}
