package com.service;

import java.util.ArrayList;

import com.model.Student;

public interface StuService {

	public void addOrUpdate(Student student);
	public ArrayList<Student> viewAllStu();
	public void deleteStu(int id);
	public Student gteById(int id);
	
}
