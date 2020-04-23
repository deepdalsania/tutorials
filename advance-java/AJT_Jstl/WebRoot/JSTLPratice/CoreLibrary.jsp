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
    
    <title>My JSP 'CoreLibrary.jsp' starting page</title>
    
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
    <br>This is my JSP page. <br>
     
  	<c:set var="i" value="${100*4+100}" scope="session" />
	
  	<c:if test="${i >= 410}">
  	<p>Answer is : <c:out value="${i}"/></p><br>
  	
  	</c:if>
  	<c:choose>
  	  <c:when test="${i >= 410}">
  	   Income is good.
  	  </c:when>
  	  <c:otherwise>
  	  Income is not good.
  	  </c:otherwise>
  	</c:choose>
  	<c:remove var="i"/>
  	<c:out value="${i}" /><br>
  	<c:catch var="e">
  	 <% int x = 2/0; %>	
  	</c:catch>
  	
  	<c:if test="${e != null}">
  	<p>The type of exception is : ${e} <br />  
   There is an exception: ${e.message}</p>  
  	
  	</c:if>
  	
  	C:token use<br>
  	<c:forTokens items="Deep-Jhanvi-Kishan-Parimal" delims="-" var="name">  
   <c:out value="${name}"/><p>  
	</c:forTokens> 
	c:param demo<br>
	

	 <c:url value="/JSTLPratice/ImportCore.jsp" var="i">
	  <c:param name="t" value="123" />
	 </c:url>
  	${i}<br>
	
  	</body>
</html>
