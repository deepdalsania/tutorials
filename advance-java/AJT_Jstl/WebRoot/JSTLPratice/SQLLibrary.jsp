<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'SQLLibrary.jsp' starting page</title>
    
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
    <sql:setDataSource var="db" 
  	url="jdbc:odbc:sqldata"
  	driver="sun.jdbc.odbc.JdbcOdbcDriver" 
  	user="system" password="deepDD@410"/><sql:update dataSource="${db}" >
  	insert into userinfo value(4,"parimal","k@123");
  	delete from userinfo where id=2;
  	update userinfo set username="parim" where id=4; 
  	</sql:update>
  	<sql:query var="result" dataSource="${db}">
  	select * from userinfo;
  	</sql:query>
  	
  	<c:forEach var="row" items="${result.row}">
  	<c:out value="${row.id}"></c:out><br>
  	<c:out value="${row.username}"></c:out><br>
  	<c:out value="${row.password}"></c:out><br>
  	</c:forEach>
  	
  </body>
</html>
