package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CustomerDao;
import model.Customer;

@WebServlet("/reg")
public class Registration extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uname = req.getParameter("uname");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		String mobile = req.getParameter("mobile");
	
		
		Customer c = new Customer();
		c.setUname(uname);
		c.setEmail(email);
		c.setPass(pass);
		c.setMobile(mobile);
	
		
		CustomerDao dao = new CustomerDao();
		String uemail = dao.isExist(c);
			
		if(uemail!=null)
		{
			
			req.setAttribute("msg", "Email already registered!!!");
			req.getRequestDispatcher("register.jsp").forward(req, resp);
			
		}
		
		else
		{
			int i = dao.addCustomer(c);
			if(i>0)
		
			req.setAttribute("msg", "Registration Successfully!!!");
			req.getRequestDispatcher("register.jsp").forward(req, resp);
		}
	}
	
}

