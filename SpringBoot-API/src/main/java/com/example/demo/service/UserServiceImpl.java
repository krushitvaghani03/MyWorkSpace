package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;
	
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return (List<User>) userRepo.findAll();
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(int id) {

		userRepo.deleteById(id);
		
	}

	@Override
	public void updateUser(int id, User user) {

		userRepo.save(user);
		
	}

	@Override
	public void addUser(User user) {

		userRepo.save(user);
	}

}
