package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection conn = DriverManager.getConnection("jdbc:odbc:Data");
			/*String fname = req.getParameter("fanme");
			String lname = req.getParameter("lname");
			String uname = req.getParameter("uname");
			String pass = req.getParameter("pass");*/
			String s = "insert into UserInfo (fname,lname,uname,pass)values(?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(s);
			
			ps.execute();
			ps.close();
			conn.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Databse Error : "+e);
		}
		
		
	
	}
}
