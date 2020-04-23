package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Summer16Q4_b extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html");
		pw.println("After removing A  = " + req.getAttribute("a"));
		pw.println("Client browser : " + req.getHeader("User-Agent"));
		pw.println("Client Ip Address : " + req.getRemoteAddr());
		pw.println("Client Port Number :  " + req.getRemotePort());
		pw.println("Server Port Number : " + req.getServerPort());
		pw.println("Local Port Number : " + req.getLocalPort());
		pw.print("Method to submit Request is : " + req.getMethod());
		pw.println("Query String is : " + req.getQueryString());
	}
}
