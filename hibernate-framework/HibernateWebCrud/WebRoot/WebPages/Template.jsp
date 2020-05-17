<%@ page language="java" import="java.util.*,org.hibernate.*" pageEncoding="ISO-8859-1"%>
<%@page import="org.hibernate.cfg.AnnotationConfiguration"%>
<%@page import="com.UserInfoModel"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Template.jsp' starting page</title>
    
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
    <a href="/Insert.jsp">Insert</a><br>
    <%! long id; %>
    <%! String uname; %>
    <%! String pass; %>
   
    <form>
    <table  border="1" width="auto">
    <tr><th>ID</th><th>Username</th><th>Password</th>
    <th>UPDATE</th><th>DELETE</th></tr>
    <%
    	SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
    	Session ss = sessionFactory.openSession();
    %>
    <tr>
    	<td><a href="/Update.jsp?a=<%= id%>&b=<%= uname %>&c=<%= pass %>">UPDATE</a></td>
    	<td><a href="/Delete.jsp?d=<%= id%>">DELETE</a></td>
   	</tr>
    	<%
    	ss.close();
    	 %>
    	 
    </table>
    
    
    
    </form>
  </body>
</html>
