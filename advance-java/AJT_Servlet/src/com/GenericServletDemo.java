package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServletDemo extends GenericServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = resp.getWriter();
		pw.println("This is my GenricServlet Page");
		pw.println("Addition is : "+(Integer.parseInt(req.getParameter("n1"))+Integer.parseInt(req.getParameter("n2"))));
		/*ServletConfig sc = getServletConfig();
		pw.println(sc.getInitParameter("d"));*/
	}
	

}
