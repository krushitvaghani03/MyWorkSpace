package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.userservice.UserService;
import  com.example.demo.model.User;
@RestController
public class UserController {

	@RequestMapping("/")
	public String User()
	{
		return "Helloo";
	}
	
	@GetMapping("user")
	public List<User> Get()
	{
		return new UserService().getAll();
	}
	
	@PostMapping("user")
	public List<User> Post(@RequestBody User u)
	{
		return new UserService().addUser(u);
	}
	
	@PutMapping("/users")
	public String Put()
	{
		return "Put Calling...";
	}
		
	@DeleteMapping("/users")
	public String Delete()
	{
		return "Delete Calling...";
	}
	
}
