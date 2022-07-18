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

@WebServlet("/addProduct")
public class AddProduct extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		double price = Double.parseDouble(req.getParameter("price"));
		String pid = req.getParameter("pid");
		String pname = req.getParameter("pname");
		
	
		ProductDao dao = new ProductDao();
		Product p = new Product();
	
		p.setPname(pname);
		p.setPrice(price);
		
		if(!pid.equals(""))
		{
			int id = Integer.parseInt(pid);
			p.setPid(id);
			int i = dao.editProduct(p);
			if(i>0)
			{
				 ArrayList<Product> pd = dao.getAllProduct();
		    	 req.setAttribute("data", pd);	
		    	 req.getRequestDispatcher("product.jsp").forward(req, resp);
			}
					
		}
		else
		{

			String prod = dao.isExist(p);
			if(prod != null)
			{
				 ArrayList<Product> pd = dao.getAllProduct();
		    	 req.setAttribute("data", pd);			
		    	 req.setAttribute("err","Product already exist!!! ");
				req.getRequestDispatcher("product.jsp"	).forward(req, resp);
			}
			else
			{
				int i = dao.addProduct(p);

				if(i>0)
				{
					ArrayList<Product> pd = dao.getAllProduct();
					req.setAttribute("data", pd);
					req.setAttribute("msg", "Product Added Successfully!!!");
					req.getRequestDispatcher("product.jsp").forward(req, resp);
				}
			}
		}
	}
		
}
