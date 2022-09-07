package com.productdao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Product;

@Transactional
@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	SessionFactory sessionFactory;
	
	
	@Override
	public List<Product> getAllProduct() {
			Session s = sessionFactory.getCurrentSession();
			return s.createQuery("from Product").list();
	}

	@Override
	public Product getProductById(int id) {
		Session s = sessionFactory.getCurrentSession();
		Product p = s.get(Product.class, id);
		return p;
	}

	@Override
	public void addOrUpdateProduct(Product cat) {
		Session s = sessionFactory.getCurrentSession();
		s.saveOrUpdate(cat);

	}

	@Override
	public void deleteProduct(int id) {
		Session s = sessionFactory.getCurrentSession();
		Product p = s.get(Product.class, id);
		s.delete(p);

	}

}
