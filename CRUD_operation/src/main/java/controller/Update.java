package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.empdao;
import model.Employee;

@WebServlet("/update")
public class Update extends HttpServlet	
{ 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String action  = req.getParameter("action");
		int id = Integer.parseInt(req.getParameter("uid"));
		
		empdao dao = new empdao();
		
		if(action.equals("delete"))
		{
			dao.deleteEmp(id);
			req.getRequestDispatcher("display").forward(req, resp);
		}
		else if(action.equals("update"))
		{
			Employee emp =  dao.getDataById(id);
			req.setAttribute("data", emp);
			req.getRequestDispatcher("home.jsp").forward(req, resp);
		}
			
	}
}
