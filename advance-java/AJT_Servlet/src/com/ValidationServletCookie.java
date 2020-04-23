package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidationServletCookie extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		Cookie c[] = req.getCookies();
		if (c != null) {
			for (int i = 0; i < c.length; i++) {
				pw.println(c[i].getName() + ":" + c[i].getValue());
				pw.println("getMaxAge : "+c[i].getMaxAge());
			}
		}
		
		
		//pw.println("<a href='/ServletDemo/Servlet/ValidationHiddenField?uname="+id+"&pass="+pass+"'>ClickHere</a>");
		pw.close();
	}

}
