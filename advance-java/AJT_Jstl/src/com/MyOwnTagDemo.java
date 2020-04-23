package com;

import java.io.IOException;


import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyOwnTagDemo extends TagSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int doStartTag() throws JspException {
		JspWriter jspWriter = pageContext.getOut();
		try {
			jspWriter.println("My Start Tag");
			jspWriter.println("<table border='1'>" +
					"<tr>" +
					"<td>1</td>" +
					"<td>2</td>" +
					"<td>3</td>" +
					"</tr>" +
					"<tr>" +
					"<td>4</td>" +
					"<td>5</td>" +
					"<td>6</td>" +
					"</tr>" +
					"<tr>" +
					"<td>7</td>" +
					"<td>8</td>" +
					"<td>9</td>" +
					"</tr>" +
					"</table>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return SKIP_BODY;
		return EVAL_BODY_AGAIN;
	}
	
	public int doEndTag() throws JspException {
		// TODO Auto-genera6ed method stub
		JspWriter jspWriter = pageContext.getOut();
		try {
			jspWriter.println("My Start Tag");
			jspWriter.println("");
		} catch (IOException e) {
			// TODO Auto-generated catch blocks
			e.printStackTrace();
		}
		return SKIP_PAGE;
	}
}
