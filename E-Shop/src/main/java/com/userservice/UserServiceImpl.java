package com.userservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Category;
import com.model.User;
import com.userdao.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	@Override
	public void addUser(User u) {

		userDao.addUser(u);

	}

	@Override
	public List<User> getAllUser() {
	
		return userDao.getAllUser();
	}

	@Override
	public User getUserById(int id) {
	
		return userDao.getUserById(id);
	}

	@Override
	public void deleteuser(int id) {
		
		userDao.deleteuser(id);

	}
	
	@Override
	public void addCategory(Category c)
	{
		userDao.addCategory(c);
	}

	@Override
	public User userLoginCheck(User u) {
		
		return userDao.userLoginCheck(u);
	}
	
}








