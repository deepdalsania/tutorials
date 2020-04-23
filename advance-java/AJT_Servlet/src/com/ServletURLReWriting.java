package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletURLReWriting extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		String id = req.getParameter("uname");
		String pass = req.getParameter("pass");
		pw.println("Username : "+ id);
		pw.println("<br>Password : "+ pass);
		pw.println("<br><a href='/ServletDemo/Servlet/ValidationURLRewriting?uname="+id+"&pass="+pass+"'>ClickHere</a>");
		pw.close();
	}
}
