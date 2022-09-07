package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;	
	
	@RequestMapping("/")
	public String AdminHome()
	{
		return "Welcome!!!";
	}
	
	@GetMapping("/users")
	public List<User> getAllUser()
	{
		return userService.getAllUser();
	}
	
	@PostMapping("/users")
	public void addUser(@RequestBody User user)
	{
		userService.addUser(user);
	}
	
	@DeleteMapping("/users/{id}")
	public void addUser(@PathVariable("id") int id)
	{
		userService.deleteUser(id);
	}
	
	public void updateUser(@RequestBody User user,int id)
	{
		userService.updateUser(id, user);
	}
	
}
