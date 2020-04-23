package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletMethods extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	/*protected void service(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	Connection conn = DriverManager.getConnection("jdbc:odbc:Data");
	String fname = req.getParameter("fanme");
	String lname = req.getParameter("lname");
	String uname = req.getParameter("uname");
	String pass = req.getParameter("pass");
	String s = "insert into UserInfo (fname,lname,uname,pass)values(?,?,?,?)";
	PreparedStatement ps = conn.prepareStatement(s);
	
	ps.execute();
	ps.close();
	conn.close();
	
	} catch (Exception e) {
	// TODO Auto-generated catch block
		System.out.println("Databse Error : "+e);
	}*/
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		/*if we want to get more than one parameter from another web page then we have to use getRequestParameterNames or collection 
		 framework.it used at web page to another web data passing*/
		Enumeration en = req.getParameterNames();
		while(en.hasMoreElements()) {
			String st = (String) en.nextElement();
			pw.println(st + ":" +req.getParameter(st));	
		}
		pw.println("getContentLength : "+req.getContentLength());
		pw.println("getContentType : "+req.getContentType());
		pw.println("getContextPath : "+req.getContextPath());
		pw.println("getProtocol : "+req.getProtocol());
		pw.println("getServerName : "+req.getServerName());
		pw.println("getServerPort : "+req.getServerPort());
		pw.println("getServletPath : "+req.getServletPath());
		pw.println("getSession : "+req.getSession());
		pw.println("getRequestURL : "+req.getRequestURL());
		pw.println("getCookies : "+req.getCookies());
		Integer i = new Integer(10);
		req.setAttribute("a", i);
		Integer j = new Integer(4);
		req.setAttribute("b", j);
		pw.println("A = "+req.getAttribute("a") + "\nB = "+req.getAttribute("b"));
		req.removeAttribute("a");
		pw.println("After removing A  = "+req.getAttribute("a"));
		pw.println("Client browser : "+req.getHeader("User-Agent"));
		pw.println("Client Ip Address : "+req.getRemoteAddr());
		pw.println("Client Port Number :  "+req.getRemotePort());
		pw.println("Server Port Number : "+req.getServerPort());
		pw.println("Local Port Number : "+req.getLocalPort());
		pw.print("Method to submit Request is : "+req.getMethod());
		pw.println("Query String is : "+req.getQueryString());
	}
	
	/*protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	//	if we want to pass data and get data within web pages then we have to use get and set attribute
		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html");
		resp.setBufferSize(10000);
		pw.println("response methods");
		pw.println("BufferSize : "+resp.getBufferSize());
		pw.println("getContentType : "+resp.getContentType());
		pw.println("resp.getCharacterEncoding : "+resp.getCharacterEncoding());
		
		resp.flushBuffer();
	}*/
	

}
