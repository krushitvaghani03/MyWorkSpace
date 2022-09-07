package com.categorydao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Category;

@Transactional
@Repository
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<Category> getAllCategory() {
	
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Category").list();
	}

	@Override
	public Category getCatById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Category c = session.load(Category.class, id);
		
		return c;
	}

	@Override
	public void addOrUpdateCate(Category cat) {
		Session session = sessionFactory.getCurrentSession();

		session.saveOrUpdate(cat);
	}

	@Override
	public void deleteCategory(int id) {
		Session session = sessionFactory.getCurrentSession();

		Category c = session.load(Category.class, id);
		session.delete(c);
	}

}
