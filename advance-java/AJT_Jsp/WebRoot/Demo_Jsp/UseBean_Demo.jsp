<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'UseBean_Demo.jsp' starting page</title>
    
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
    <jsp:useBean id="stu" class="org.StudentInfoJavaBean" scope="page" />
    <jsp:setProperty property="en"  name="stu" value="d123" />
    <jsp:getProperty property="en" name="stu" /><br/>
    <jsp:setProperty property="age" name="stu" value="18"/>
    <jsp:getProperty property="age" name="stu"/><br/>
    <%
    stu.setName("deep");
    out.print(stu.getName());
     %>  </body>
</html>
