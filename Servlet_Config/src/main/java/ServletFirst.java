import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletFirst extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter pw = resp.getWriter();
		ServletConfig sc =  getServletConfig();
		String e = sc.getInitParameter("email");
		System.out.println(e);
		System.out.println("1."+sc.getServletName());
		//System.out.println(sc.getInitParameterNames());
		pw.print("<h1>"+e+"</h1>");
		
		Enumeration en = sc.getInitParameterNames();
		while(en.hasMoreElements())
		{
			System.out.println("2."+en.nextElement());
		}
		
		ServletContext c = getServletContext();
		String x = c.getInitParameter("driver");
		pw.print("<h1>"+x+"</h1>");

		
		
	}
}
