package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Empdao;
import model.Employee;

@WebServlet("/reg")
public class Reg extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int uid=0;
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String dept = req.getParameter("dept");
		
		if(!id.equals("")) 
		{
			uid = Integer.parseInt(id);
		}
		
		Employee e = new Employee();
		e.setId(uid);
		e.setName(name);
		e.setDept(dept);
		e.setEmail(email);
		
		Empdao dao = new Empdao();
		dao.addEmp(e);
		
		req.setAttribute("msg","Added Successfully!!!");
		req.getRequestDispatcher("Home.jsp").forward(req, resp);
		
	}
}
