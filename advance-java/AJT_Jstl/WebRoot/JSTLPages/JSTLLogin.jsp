<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>


<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'JSTLLogin.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body><br>
	 <c:if test="${not empty param.uname and not empty param.pass}">
	<sql:setDataSource var="db" 
  	url="jdbc:odbc:sqldata"
  	driver="sun.jdbc.odbc.JdbcOdbcDriver" 
  	user="system" password="deepDD@410"/>
  	<sql:query var="selectQ" dataSource="${db}">
  	 select count(*) as ucount from userdb
        where username='${param.uname}'
        and password='${param.pass}'
   	</sql:query>
  
  	<c:forEach items="${selectQ.rows}" var="r">
  	  	<c:choose>
          <c:when test="${r.ucount gt 0}">
  	       
            <c:redirect url="/JSTLPages/Success.jsp" />
          </c:when>
          <c:otherwise>
            <c:redirect url="/JSTLPages/Failure.jsp" />
          </c:otherwise>
        </c:choose>
 	</c:forEach>
   </c:if>
   
  </body>
</html>
