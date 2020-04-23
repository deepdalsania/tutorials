package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpServletDemo extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*If we are using all the methods which are doGet,dopost and all and service method is there then it will override all hide
	 * all methods and only print the service method outut
	 * */
	/*protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		pw.println("This is my HttpServle Page");
	}*/
	
	/*Default method in jsp form tag is get if we are using get then we hazve to use here doGet method if we are using post
	 * method in form tag then definitely we have to use doPost in servlet  */
	/*protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		try {
			pw.println("Division is : "+(Integer.parseInt(req.getParameter("n1"))/Integer.parseInt(req.getParameter("n2"))));
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			pw.println("Error : "+e);
			
		}
	}*/
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		int a = Integer.parseInt(req.getParameter("n1"));
		int b = Integer.parseInt(req.getParameter("n2"));
		try {
			pw.println("Division is : "+(a/b));
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			pw.println("Error : "+e);
			
		}
	}

}
	

