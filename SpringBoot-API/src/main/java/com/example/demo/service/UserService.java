package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {

	public List<User> getAllUser();
	public User getUserById(int id);
	public void deleteUser(int id);
	public void updateUser(int id,User user);
	public void addUser( com.example.demo.model.User user);
	
}
