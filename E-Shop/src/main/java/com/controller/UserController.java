package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.categoryservice.categoryservice;
import com.model.User;
import com.userservice.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired
	categoryservice categoryservice;
	
	@RequestMapping("/")
	public ModelAndView Userindex()
	{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("categories", categoryservice.getAllCategory());
		modelAndView.setViewName("userindex");
		return modelAndView;
	}
	
	@RequestMapping("/userlogin")
	public ModelAndView UserLogin()
	{
		ModelAndView model = new ModelAndView();
		model.addObject("userLogin", new User());
		return model;
	}
	
	
	
	@RequestMapping("/userregister")
	public ModelAndView UserRegister()
	{
		ModelAndView model = new ModelAndView();
		model.addObject("user", new User());
		model.setViewName("userregister");
		return model;
	}
	
	@RequestMapping(value = "/userregistration" , method = RequestMethod.POST)
	public String addUser( @Valid @ModelAttribute("user") User u,BindingResult br)
	{
		if(br.hasErrors())
		{
			return "userlogin";
		}
		else
		{
			userService.addUser(u);
			return "userregister";
		}
		
	}
	
	@RequestMapping(value = "/logincheck" , method = RequestMethod.POST)
	public ModelAndView LoginCheck(@ModelAttribute("userLogin")User u , HttpServletRequest req)
	{
		ModelAndView model = new ModelAndView();
		User name =  userService.userLoginCheck(u);
		if(name==null)
		{
			
			model.addObject("err", "Please, enter correct Email or Password!!!");
			model.setViewName("userlogin");
		}
		else
		{
			HttpSession session = req.getSession();
			session.setAttribute("user", name.getFname());
			model.setViewName("userindex");
		}
		return model;
	}
	
	@RequestMapping("/userLogout")
	public String Logout(HttpServletRequest req)
	{
		HttpSession session = req.getSession(false);
		session.invalidate();
		return "userindex";
	}
	
	
	@RequestMapping("/shop-cart")
	public String Cart()
	{
		return "usercart";
	}
	
}









