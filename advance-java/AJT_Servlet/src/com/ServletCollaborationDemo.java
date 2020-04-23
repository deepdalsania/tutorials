package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletCollaborationDemo extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");

		String id = req.getParameter("uname");
		String pw = req.getParameter("pass");
		if ((id.equals("Deep")) && pw.equals("dd@123")) {

			RequestDispatcher dispatcher = req.getRequestDispatcher("/WebPages/Matched.jsp");
			dispatcher.forward(req, resp);
			/*
			 * RequestDispatcher dispatcher =
			 * req.getRequestDispatcher("https://www.javatpoint.com/New-features-in-java");
			 * dispatcher.forward(req, resp); within same server communication
			 */
		} else {

			RequestDispatcher dispatcher = req.getRequestDispatcher("/WebPages/Failure.jsp");
			dispatcher.include(req, resp);
			// resp.sendRedirect("https://www.javatpoint.com/java-tutorial"); with different
			// server communication is possible
		}
	}

}
