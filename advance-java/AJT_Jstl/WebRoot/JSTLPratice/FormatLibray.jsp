<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'FormatLibray.jsp' starting page</title>
    
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
    Format-Date:
    <fmt:formatDate value="<%= new Date() %>" dateStyle="medium" pattern="dd/MM/yyyy"/>
    <br/>
    
     Format-Date:
    <fmt:formatDate value="<%= new Date() %>" pattern="dd/MMMM/yyyy" />
    <br/>
    
     Format-Date:
    <fmt:formatDate value="<%= new Date() %>" type="time" dateStyle="long" />
    <br>
    Format-Number:
    <fmt:formatNumber value="1234587.567" maxFractionDigits="2" maxIntegerDigits="5" pattern="#.##"/>
    <br/>
    
  </body>
</html>
