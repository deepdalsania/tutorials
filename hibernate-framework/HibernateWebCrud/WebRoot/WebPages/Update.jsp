<%@ page language="java" import="java.util.*,org.hibernate.*" pageEncoding="ISO-8859-1"%>
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
    
    <title>My JSP 'Update.jsp' starting page</title>
    
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
   <%
   	long id = Long.valueOf(request.getParameter("a"));
   	String uname = request.getParameter("b");
   	String pass = request.getParameter("c");
   	if(uname != null){
   	
   		try{
   		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
    	Session ss = sessionFactory.openSession();
    	ss.beginTransaction();
    	UserInfoModel infoModel = (UserInfoModel) ss.get(UserInfoModel.class , id);
    	infoModel.setUname(uname);
    	ss.getTransaction().commit();
  		ss.save(infoModel);
    	ss.close();
    	out.println("<h1>Data Updated </h1>");
    	}catch(Exception e){
    		out.println(e);
    	}
   	} %>
   	<form>
    <table>
    <tr>
    <th>ID</th>
    <td><input type="text" name="a" value="<%= id%>"></td>
    </tr>
    <tr>
    <th>Username</th>
    <td><input type="text" name="b" value="<%= uname%>"></td>
    </tr>
    <tr>
    <th><input type="submit" value="Update"></th>
    </tr>
    </table>
    </form>    
   
   
   
    
  </body>
</html>
