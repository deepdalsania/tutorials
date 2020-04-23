<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'CoreRedirect.jsp' starting page</title>
    
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
    This is my JSP page. <br>
    <%-- Both Redirection is possible within server and outside the server --%>
    <c:set var="i" value="${100*4+100}" scope="session" />
  	<c:choose>
  	  <c:when test="${i >= 410}">
  	   <c:redirect url="http://javatpoint.com" />
  	  </c:when>
  	  <c:otherwise>
  	  <c:redirect url="/JSTLPratice/ImportCore.jsp" />
  	  </c:otherwise>
  	</c:choose>
  </body>
</html>
