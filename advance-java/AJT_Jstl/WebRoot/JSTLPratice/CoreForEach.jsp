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
    
    <title>My JSP 'CoreForEach.jsp' starting page</title>
    
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
    print in acsending order <br>
  	<c:forEach var="j" begin="1" end="3">  
   Item <c:out value="${j}"/><p>  
	</c:forEach>
  	print in reverse order <br>
  	<c:forEach var="j" begin="1" end="5" step="1" >
  	
  	<%-- using this also possible <c:forEach var="j" begin="1" end="5" step="1" varStatus="l" > 
  	${l.end - j + l.begin}
  	</c:forEach>
  	--%>  
  	J = <c:out value="${6-j}" /><br>
  	</c:forEach>
  </body>
</html>
