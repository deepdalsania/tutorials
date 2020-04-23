package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigDemo extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		/*This will use to initialize parameter before execution of servlet or at initialization time of servlet*/
		ServletConfig config = getServletConfig();
		Enumeration enumeration = config.getInitParameterNames();
		
		while (enumeration.hasMoreElements()) {
			String str = (String) enumeration.nextElement();
			pw.println(str + "=" + config.getInitParameter(str));
		//	pw.println();
		}
	
	}

}
