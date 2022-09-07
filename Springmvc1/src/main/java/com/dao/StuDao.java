package com.dao;

import java.util.ArrayList;

import com.model.Student;

public interface StuDao {

	public void addOrUpdate(Student student);
	public ArrayList<Student> viewAllStu();
	public void deleteStu(int id);
	public Student gteById(int id);
	
}
