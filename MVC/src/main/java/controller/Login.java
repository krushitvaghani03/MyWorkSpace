package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDao;
import model.User;

@WebServlet("/login")
public class Login  extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");
		
		User u = new User();
		u.setUname(uname);
		u.setPass(pass);
		
		UserDao dao = new UserDao();
		String user = dao.loginCheck(u);
		
		if(user != null)
		{
			HttpSession session = req.getSession();
			session.setAttribute("uname", uname);
			req.getRequestDispatcher("Home.jsp").forward(req, resp);
		}
		else
		{
			req.setAttribute("msg","Invalid Username & Password!!!");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
		
	}
}
