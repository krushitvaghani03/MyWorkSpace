package com.dao;

import java.util.ArrayList;

import com.model.User;

public interface UserDao {

	void addOrupdateUser(User user);
	public ArrayList<User> viewAllUser();
	public User getDataById(int id);
	public void deleteUser(int id);

}
