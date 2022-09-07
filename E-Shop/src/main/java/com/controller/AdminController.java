package com.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.boot.jaxb.mapping.spi.Adapter3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.adminservice.AdminService;
import com.categoryservice.categoryservice;
import com.model.Admin;
import com.model.Category;
import com.model.User;
import com.model.Product; 
import com.productservice.ProductService;
import com.userservice.UserService;

@Controller
public class AdminController {

	@Autowired
	UserService service;
	
	@Autowired
	com.categoryservice.categoryservice categoryservice;
	
	@Autowired
	ProductService productService;
	
	@Autowired
	AdminService adminService;
	
	@RequestMapping("/adminindex")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("/adminsidebar")
	public String AdminSidebar()
	{
		return "adminsidebar";
	}
	
	@RequestMapping("/adminlogin")
	public ModelAndView AdminPage()
	{
		ModelAndView model = new ModelAndView();
		model.addObject("adminLogin",new Admin());
		model.setViewName("adminlogin");
		return model;
	}
	
	@RequestMapping("login")
	public ModelAndView AdminLogin(@ModelAttribute("adminLogin") Admin ad, HttpServletRequest req)
	{
		ModelAndView model = new ModelAndView();
		String x = adminService.LoginCheck(ad);
		System.out.println(x);
		
		if(x!=null)
		{
			HttpSession session = req.getSession();
			session.setAttribute("name", x);
			model.setViewName("index");
		}
		else
		{
			model.setViewName("redirect:adminlogin");
		}
		return model;
	}
	
	@RequestMapping("/tables-basic")
	public ModelAndView getAlluser() 
	{
		ModelAndView model = new ModelAndView();
		model.addObject("data", service.getAllUser());
		model.setViewName("tables-basic");
		return model;	
	}
	
	
	@RequestMapping("/admincategory")
	public ModelAndView Category()
	{
		ModelAndView model = new ModelAndView();
		model.addObject("categorydata", new Category());
		model.addObject("data", categoryservice.getAllCategory());
		model.setViewName("admincategory");
		return model;	
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "addCatagory")
	public ModelAndView addCatagory(@ModelAttribute("categorydata") Category category)
	{
		ModelAndView model = new ModelAndView();
		categoryservice.addOrUpdateCate(category);
		model.setViewName("redirect:admincategory");
		return model;
	}
		
	@RequestMapping("/adminproduct")
	public ModelAndView Prod()
	{
		ModelAndView model = new ModelAndView();
		model.addObject("product", new Product());
		model.addObject("categories", categoryservice.getAllCategory());
		model.setViewName("ProductAdmin");
		return model;
	}
	
	@RequestMapping(value = "/AddProduct", method = RequestMethod.POST)
	public ModelAndView AddProduct(@ModelAttribute("product") Product product ,@RequestParam(value = "catid",required = true) int cid,@RequestParam CommonsMultipartFile file,HttpSession session)
	{
		String path = "F:\\Hibernate\\E-Shop\\src\\main\\webapp\\WEB-INF\\user\\img\\ProductImage";
		String filepath = path+File.separator+file.getOriginalFilename();
		System.out.println(filepath);
		
		byte b[] = file.getBytes();
		try {	
			FileOutputStream fos = new FileOutputStream(new File(filepath));
			fos.write(b);
			fos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Category cat = categoryservice.getCatById(cid);
		product.setImage(file.getOriginalFilename());
		product.setCategory(cat);
		productService.addOrUpdateProduct(product);
		ModelAndView model = new ModelAndView();
		model.setViewName("redirect:adminproduct");
		return model; 
	}
	
	@RequestMapping("updateProduct")
	public ModelAndView UpdateProduct(@RequestParam("uid") int id)
	{
		ModelAndView model = new ModelAndView();
		model.addObject("product",productService.getProductById(id));
		model.addObject("categories", categoryservice.getAllCategory());
		model.setViewName("ProductAdmin");
		return model;
	}
	
	@RequestMapping("deleteProduct")
	public ModelAndView DeleteProduct(@RequestParam("uid") int id)
	{
		ModelAndView model = new ModelAndView();
		productService.deleteProduct(id);
		model.setViewName("redirect:adminproduct");
		return model;
		
	}
}
