package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.Student;
import com.service.StuService;

@Controller
public class StudentController {

	@Autowired
	StuService stuService;
	
	@RequestMapping("/")
	public ModelAndView index()
	{
		ModelAndView model = new ModelAndView();
		ArrayList<Student> stu = stuService.viewAllStu();
		Student student = new Student();
		model.addObject("data", stu);
		model.addObject("student", student);
		model.setViewName("index");
		
		return model;
		
	}
	
	@RequestMapping("/addStudent")
	public ModelAndView addStu(@ModelAttribute("student") Student s)
	{
		stuService.addOrUpdate(s);
		ModelAndView model = new ModelAndView();
		ArrayList<Student> st = stuService.viewAllStu();
		Student student = new Student();
		model.addObject("student", student);
		model.addObject("data", st);
		model.setViewName("index");
		return model;
	}
	
	@RequestMapping("/delete")
	public ModelAndView deleteStu(@RequestParam("did") int id)
	{
		stuService.deleteStu(id);
		ModelAndView model = new ModelAndView();
		ArrayList<Student> st = stuService.viewAllStu();
		Student student = new Student();
		model.addObject("student", student);
		model.addObject("data", st);
		model.setViewName("index");
		return model;
	}
	
	@RequestMapping("/update")
	public ModelAndView updateStu(@RequestParam("uid") int uid)
	{
		ModelAndView model = new ModelAndView();
		ArrayList<Student> st = stuService.viewAllStu();
		Student student = stuService.gteById(uid);
		model.addObject("student", student);
		model.addObject("data", st);
		model.setViewName("index");
		return model;
	}
	
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
	
	
}
