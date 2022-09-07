package com.dao;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.User;

@Transactional
@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void addOrupdateUser(User user) {
		
		Session s = sessionFactory.getCurrentSession();
		s.saveOrUpdate(user);

	}
	
	@Override
	public ArrayList<User> viewAllUser() {
	
		Session s = sessionFactory.getCurrentSession();
		return (ArrayList<User>) s.createQuery("from User").list();
	}

	@Override
	public User getDataById(int id) {
		
		Session s = sessionFactory.getCurrentSession();
		User u = s.load(User.class, id);
		
		return u;
	}

	@Override
	public void deleteUser(int id) {
		
		Session s = sessionFactory.getCurrentSession();
		User u = s.load(User.class, id);
		s.delete(u);
	}



}
