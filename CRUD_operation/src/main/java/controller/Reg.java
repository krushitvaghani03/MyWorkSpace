package controller;

import java.io.IOException;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder.In;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.empdao;
import model.Employee;

@WebServlet("/reg")
public class Reg extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int uid = 0;
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String dept  = req.getParameter("dept");
		
		if(!id.equals("")) 
		{
			uid = Integer.parseInt(id);
		}
		
		empdao dao = new empdao();
		
		Employee e = new Employee();
		e.setId(uid);
		e.setName(name);
		e.setEmail(email);
		e.setDept(dept);
			
		Employee q = dao.isExist(e);
		
		
		if(q != null)
		{
			req.setAttribute("msg", "email already exists!!!");
			req.getRequestDispatcher("home.jsp").forward(req, resp);
		}
		else
		{
			dao.addEmp(e);
			req.getRequestDispatcher("display").forward(req, resp);

		}
	
}
}
