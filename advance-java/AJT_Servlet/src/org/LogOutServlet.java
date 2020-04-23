package org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogOutServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");  
        PrintWriter pw = resp.getWriter();  
        req.getRequestDispatcher("/LoginApp/Link.html").include(req, resp);
        HttpSession httpSession = req.getSession();
        httpSession.invalidate();
        pw.println("You Are Successfully Logged Out");
        pw.close();
	}
}
