<%@ page language="java" import="java.util.*,org.hibernate.*" pageEncoding="ISO-8859-1"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="com.UserInfoModel"%>
<%@page import="org.hibernate.cfg.AnnotationConfiguration"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Insert.jsp' starting page</title>
    
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
    <%! long id; %>
    <%! String uname; %>
    <%! String pass; %>
    <a href="/Template.jsp">Display</a><br>
    <%
    String num = request.getParameter("t1");
    if(num != null)
    {
    	id = Long.valueOf(num);
    	uname = request.getParameter("t2");
    	pass = request.getParameter("t3");
    	try
    	{
    	SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
    	Session ss = sessionFactory.openSession();
    	
    	ss.beginTransaction();
    	UserInfoModel infoModel = new UserInfoModel(id , uname ,pass);
    	ss.save(infoModel);
    	ss.getTransaction().commit();
    	ss.close();
    	out.println("<h1>Data Inserted</h1>");
    }catch(Exception e){
    	out.println(e);
    }
   }
    %>
    <form>
    <table>
    <tr>
    <th>ID</th>
    <td><input type="text" name="t1"></td>
    </tr>
    <tr>
    <th>Username</th>
    <td><input type="text" name="t2"></td>
    </tr>
    <tr>
    <th>Password</th>
    <td><input type="text" name="t3"></td>
    </tr>
    <tr>
    <th colspan="2"><input type="submit" value="Insert"></th>
    </tr>
    </table>
    </form>    
  </body>
</html>
