<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Cacl.jsp' starting page</title>
    
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
    <form action="/First_Demo/Demo_Jsp/CalcResult.jsp">
    Number 1 : <input type="text" name="n1" /><br/>
    Number 2 : <input type="text" name="n2" /><br/><br/>
    <input type="submit" name="b1" value="ADD" />&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="submit" name="b1" value="SUB" />&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="submit" name="b1" value="MUL" />&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="submit" name="b1" value="DIV" />&nbsp;&nbsp;&nbsp;&nbsp;
    </form>
  </body>
</html>
