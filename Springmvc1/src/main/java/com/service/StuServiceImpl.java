package com.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StuDao;
import com.model.Student;

@Service
public class StuServiceImpl implements StuService {

	@Autowired
	StuDao stuDao;
	
	@Override
	public void addOrUpdate(Student student) {
		
		stuDao.addOrUpdate(student);
	}

	@Override
	public ArrayList<Student> viewAllStu() {
		
		return stuDao.viewAllStu();
	}

	@Override
	public void deleteStu(int id) {

		stuDao.deleteStu(id);
		
	}

	@Override
	public Student gteById(int id) {
		
		return stuDao.gteById(id);
	}

}
