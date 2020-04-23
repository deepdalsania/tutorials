package org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HomeServlet extends HttpServlet {

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
        if ( httpSession.getAttribute("id") != null) {
        	req.setAttribute("uname", req.getParameter("uname"));
			pw.println("Welcome " + req.getAttribute("id") + "to My Home Page");
		} else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/LoginApp/Login.jsp");
			dispatcher.forward(req, resp);
		}
	}

}
