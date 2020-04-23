<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1" errorPage="Exception_Error.jsp"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Exception_Process.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
 <%
  String num1 = request.getParameter("n1"); /*getParameter(String arg0) so that we have to get n1 in string and after we conver*/
  String num2 = request.getParameter("n2");
  
  int a = Integer.parseInt(num1);
  int b = Integer.parseInt(num2);
  
  out.print("Division is = "+(a/b));
  %>
  </body>
</html>
