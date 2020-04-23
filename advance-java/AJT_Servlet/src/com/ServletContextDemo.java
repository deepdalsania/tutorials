package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextDemo extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		
		ServletContext context = getServletContext();
		Enumeration enumeration = context.getInitParameterNames();
		
		while (enumeration.hasMoreElements()) {
			String str = (String) enumeration.nextElement();
			pw.println(str + "=" + context.getInitParameter(str));
		}
		
	}
}
 