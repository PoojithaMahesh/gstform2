package gst;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class KarServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String color=req.getParameter("color");
		
		ServletContext context=getServletContext();
		double cgst=Double.parseDouble(context.getInitParameter("cgst"));
		System.out.println(cgst);
		
		ServletConfig config=getServletConfig();
		double sgstofkar=Double.parseDouble(config.getInitParameter("sgstofkar"));
		
		System.out.println("sgst is::::"+sgstofkar);
		
		System.out.println("sgst of tn:::::::::"+config.getInitParameter("sgstoftn"));
		
		
	}
}
