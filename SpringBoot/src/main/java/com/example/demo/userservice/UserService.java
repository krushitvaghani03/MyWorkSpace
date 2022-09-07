package com.example.demo.userservice;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.User;

public class UserService {

	List<User> userdata = new ArrayList<User>();
	public UserService() {
			
		userdata.add(new User(10, "Laxman", "laxman@gmail.com"));
		userdata.add(new User(20, "Krushit", "krushit@gmail.com"));
	}
	
	public List<User> getAll()
	{
		return userdata;
	}
	
	public List<User> addUser(User u)
	{
		userdata.add(u);
		return userdata;
	}
	
}

