package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;
import model.Product;

@WebServlet("/product")
public class ProductDetail extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ProductDao dao = new ProductDao();
		ArrayList<Product> p = dao.getAllProduct();
		
		req.setAttribute("data", p);
		req.getRequestDispatcher("product.jsp").forward(req, resp);
		
	}
	
}
