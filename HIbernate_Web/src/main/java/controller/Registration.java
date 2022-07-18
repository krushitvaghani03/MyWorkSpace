package controller;

import java.io.IOException;

import dao.empdao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Employee;

@WebServlet("/reg")
public class Registration extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String email = req	.getParameter("email");
		String dept  = req.getParameter("dept");
		
		Employee e = new Employee();
		e.setName(name);
		e.setEmail(email);
		e.setDept(dept);
		
		empdao dao = new empdao();
		dao.addemp(e);
	
	}		
	
}
