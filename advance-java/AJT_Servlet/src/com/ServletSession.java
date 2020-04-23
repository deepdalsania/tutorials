package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletSession extends HttpServlet{

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
		
		HttpSession httpSession = req.getSession();
		httpSession.setAttribute("id", "d123");
		pw.println("getCreationTime :"+httpSession.getCreationTime());
		httpSession.setMaxInactiveInterval(10);
		//httpSession.invalidate();  it removes all attributes from the session object
		
		pw.println("getMaxInactiveInterval : "+httpSession.getMaxInactiveInterval());
		
		pw.println("<a href='/ServletDemo/Servlet/ValidationSession'>CickHere</a>");
	}

}
