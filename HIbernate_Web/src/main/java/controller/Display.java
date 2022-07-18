package controller;

import java.io.IOException;
import java.util.ArrayList;

import dao.empdao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Employee;

@WebServlet("/display")
public class Display extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		empdao dao = new empdao();
		
		ArrayList<Employee> emp = dao.getallemp();
		req.setAttribute("data", emp);
		req.getRequestDispatcher("display.jsp").forward(req, resp);
		
	}
	
}
