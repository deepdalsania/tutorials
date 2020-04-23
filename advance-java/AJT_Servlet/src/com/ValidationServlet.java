package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidationServlet extends HttpServlet{

	/**
	 * 
	 */
	String s = "select * from UserInfo where Username=? and Password=?";
	public boolean check(String uname , String pass) {
		
		
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection conn = DriverManager.getConnection("jdbc:odbc:UserData"); // problem
			
			PreparedStatement ps = conn.prepareStatement(s);
			
			ps.setString(1, uname);
			ps.setString(2, pass);
			ps.execute();
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return false;
	}

	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");
		
		
		if(check(uname, pass)){
		
				 resp.sendRedirect("/ServletDemo/WebPages/Success.jsp");

		}
		else{
				resp.sendRedirect("/ServletDemo/WebPages/Failure.jsp");
					  
		}
				
	}
		
	
		/*PrintWriter pw = resp.getWriter();
		pw.print("deep");*/
		
	/*	ps.close();
		conn.close(); */
	
	
	/*protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pout = res.getWriter();
		pout.print("Hello");
	}*/
	
}