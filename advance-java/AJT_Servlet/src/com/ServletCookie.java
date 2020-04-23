package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletCookie extends HttpServlet{

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
		pw.println("Password : "+ pass);
		Cookie cookie = new Cookie("id" , "d123");
		resp.addCookie(cookie);
		/*pw.println("<form action='/ServletDemo/Servlet/ValidationServletCookie'>");   
		pw.println("<input type='submit' value='LOGIN' />");
		pw.println("</form>");*/
		pw.println("<a href='/ServletDemo/Servlet/ValidationServletCookie'>CickHere</a>");
	//	pw.println("<a href='/ServletDemo/Servlet/ValidationHiddenField?uname="+id+"&pass="+pass+"'>ClickHere</a>");
		pw.close();
	}

}
