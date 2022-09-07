package com.service;

import java.util.ArrayList;

import com.model.User;


public interface UserService {

	public void addOrupdateUser(User u);
	public ArrayList<User> viewAllUser();
	public User getDataById(int id);
	public void deleteUser(int id);
	
}
