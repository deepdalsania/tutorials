<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1" %><%-- errorPage="Exception_Error.jsp"--%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ClacResult.jsp' starting page</title>
    
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
   /*if(s.equals("ADD")){
   out.print("Addtion is : "+(Integer.parseInt(request.getParameter("n1"))+Integer.parseInt(request.getParameter("n2"))));*/
   String s = request.getParameter("b1");
   int n1 = Integer.parseInt(request.getParameter("n1"));
   int n2 = Integer.parseInt(request.getParameter("n2"));
   switch(s.charAt(0))
   {
   case 'A' : 
                out.print("Addtion is : "+(n1+n2));
                break;
              
   case 'S' :
             	
                out.print("Subtraction is : "+(n1-n2));
                 break;
   case 'M' :
             
                out.print("Multiplication is : "+(n1*n2));
                 break;
                 
   case 'D' :
             
                
                out.print("Division : "+(n1/n2));
                 break;
            
   }
   
    %>
  </body>
</html>
