package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CustomerDao;
import model.Customer;

@WebServlet("/login")
public class Login extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		Customer c = new Customer();
		c.setEmail(email);
		c.setPass(pass);
		
		CustomerDao dao = new CustomerDao();
		String username = dao.loginCheck(c);
		
		
		if(username==null)
		{
			
			req.setAttribute("msg", "Please, enter valid email or password !!!");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
		else
		{
			HttpSession session = req.getSession();
			session.setAttribute("user", username);
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
	}
}
