package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Empdao;
import model.Employee;

@WebServlet("/update")
public class update extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("uid"));
		String action = req.getParameter("action");
		
		Empdao dao = new Empdao();
		if(action.equals("delete"))
		{
			dao.deletEmp(id);
			req.getRequestDispatcher("display").forward(req, resp);
		}
		else if(action.equals("update"))
		{
			Employee emp =  dao.getDataById(id);
			req.setAttribute("data", emp);
			req.getRequestDispatcher("display.jsp").forward(req, resp);
			
		}

	}
}
