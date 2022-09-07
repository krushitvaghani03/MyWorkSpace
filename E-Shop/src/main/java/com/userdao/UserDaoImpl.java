package com.userdao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Category;
import com.model.User;

@Transactional
@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory sessionFactory;
	
	
	@Override
	public void addUser(User u) {
		
		Session s = sessionFactory.getCurrentSession();
		s.saveOrUpdate(u);

	}

	@Override
	public List<User> getAllUser() {
		Session s = sessionFactory.getCurrentSession();
		
		return s.createQuery("from User").list();
	}

	@Override
	public User getUserById(int id) {

		Session s = sessionFactory.getCurrentSession();
		User u = s.load(User.class, id);
		return u;
	}

	@Override
	public void deleteuser(int id) {

		Session s = sessionFactory.getCurrentSession();
		User u = s.load(User.class, id);
		s.delete(u);

	}
	
	@Override
	public void addCategory(Category c)
	{
		Session s = sessionFactory.getCurrentSession();
		s.saveOrUpdate(c);
	}

	@Override
	public User userLoginCheck(User u) {

		Session s = sessionFactory.getCurrentSession();
		User x = (User)s.createQuery("from User u where u.email='"+u.getEmail()+"' and u.pass='"+u.getPass()+"'").uniqueResult();
		return x;
	}

}
