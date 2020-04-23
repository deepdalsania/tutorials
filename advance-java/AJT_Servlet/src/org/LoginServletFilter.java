package org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginServletFilter implements Filter{

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain fc) throws IOException, ServletException {
		 	resp.setContentType("text/html");  
	        PrintWriter pw = resp.getWriter();  
	        req.getRequestDispatcher("/LoginApp/Link.html").include(req, resp);  
	        
	        if (req.getParameter("uname").equals("deep") && req.getParameter("pass").equals("dd@123") ) {
				fc.doFilter(req, resp);
			} else {
				RequestDispatcher dispatcher = req.getRequestDispatcher("/WebPages/FailureServletFilter.jsp");
				dispatcher.forward(req, resp);
			}
	       
	        pw.close();  
		
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
