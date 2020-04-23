<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <base href="<%=basePath%>">
    <title>My JSP 'ScriptingTag.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>

  
  <body>&nbsp; 
  <p>This explain Script element</p>
   <jsp:include page="Directive_Include.jsp">
  		<jsp:param value="this is dynamic include." name="demo" />
  </jsp:include>
  <%! int n=6; %>
    <%    
    	class Fact{
    		long fact(int num){
    if(num == 0 || num == 1)
    return 1;
    else
    return num * fact(num-1); 
    }
    }
     %>
    <%="Factorial is : "+new Fact().fact(n) %>
    <br/>
 <%--
  This is a static include 
  <%@ include file="Directive_Include.jsp" %>
  --%> 
  
  </body>
</html>
