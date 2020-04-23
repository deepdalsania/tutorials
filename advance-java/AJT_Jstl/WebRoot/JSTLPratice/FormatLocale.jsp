<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'FormatLocale.jsp' starting page</title>
    
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
    <!-- Setting Locale to US -->
    <fmt:setLocale value="en_US"/>
    <fmt:formatNumber value="0.452" type="CURRENCY" minFractionDigits="3"></fmt:formatNumber>
    <br/>
    <!-- Setting Locale to UK -->
    <fmt:setLocale value="en_GB"/>
    <fmt:formatNumber value="0.452" type="CURRENCY" minFractionDigits="3"></fmt:formatNumber>
  <br/>
  <!-- Setting Locale to India -->
    <fmt:setLocale value="en_IN"/>
    <fmt:formatNumber value="0.452" type="CURRENCY" minFractionDigits="3"></fmt:formatNumber>
<br/>
<fmt:setLocale value="en"/>
<fmt:bundle basename="myapp">
<fmt:message key="Name"/><br/>
<fmt:message key="Address"/><br/>
<fmt:message key="Number"/><br/>
</fmt:bundle>
  </body>
</html>
