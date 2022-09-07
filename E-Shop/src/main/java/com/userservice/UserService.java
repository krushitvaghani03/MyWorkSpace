package com.userservice;

import java.util.List;

import com.model.Category;
import com.model.User;

public interface UserService {

	public void addUser(User u);
	public List<User> getAllUser();
	public User getUserById(int id);
	public void deleteuser(int id);
	public void addCategory(Category c);
	public User userLoginCheck(User u);
	
}
