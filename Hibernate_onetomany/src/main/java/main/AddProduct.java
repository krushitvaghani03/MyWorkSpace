package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import model.Category;
import model.Product;

public class AddProduct
{
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration()
				.configure("resources/hibernate.cfg.xml")
				.addAnnotatedClass(Category.class)
				.addAnnotatedClass(Product.class)
				.buildSessionFactory();
		
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		

		Category ct = new Category();
		ct.setcName("Electronics");
		
		Category ct1= new Category();
		ct1.setcName("cloths");
		
		Product pr = new Product();
		pr.setpName("Fan");
		pr.setPrice(500);
		pr.setCategory(ct);
		
		Product pr1= new Product();
		pr1.setpName("T-shirts");
		pr1.setPrice(500);
		pr1.setCategory(ct1);

		
		s.save(ct);
		s.save(pr);
		s.save(ct1);
		s.save(pr1);
		tx.commit();
		
		
}
}
					