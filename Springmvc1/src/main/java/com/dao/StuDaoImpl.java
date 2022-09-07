package com.dao;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Student;

@Transactional
@Repository
public class StuDaoImpl implements StuDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void addOrUpdate(Student student) {
		
		Session s = sessionFactory.getCurrentSession();
		s.saveOrUpdate(student);

	}

	@Override
	public ArrayList<Student> viewAllStu() {
		
		Session s = sessionFactory.getCurrentSession();
		
		return (ArrayList<Student>) s.createQuery("from Student").list();
	}

	@Override
	public void deleteStu(int id) {

		Session s = sessionFactory.getCurrentSession();
		
		Student st = s.load(Student.class, id);
		s.delete(st);
		
	}

	@Override
	public Student gteById(int id) {

		Session s = sessionFactory.getCurrentSession();
		Student st = s.get(Student.class, id);
		
		return st;
	}

}
