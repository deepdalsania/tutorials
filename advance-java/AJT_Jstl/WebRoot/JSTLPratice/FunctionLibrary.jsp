<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'FunctionLibrary.jsp' starting page</title>
    
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
    <c:set var="s" value="Hello Java   "></c:set>
    <c:out value="${s}"></c:out><br>
    <c:set var="st" value="Welcome-Java"></c:set>
    <c:out value="${st}"></c:out> <br>
    
    uppercase: ${fn:toUpperCase(s)} 
    lowercase: ${fn:toLowerCase(s)}
    trim: ${fn:trim(s)}
    contains: ${fn:contains(st,"Welcome")}
    endswith: ${fn:endsWith(s,"Java")}
    <c:set var="string1" value="It is first String."/>  
<c:set var="string2" value="It is <xyz>second String.</xyz>"/>  
  
<p>With escapeXml() Function:</p>  
<p>string-1 : ${fn:escapeXml(string1)}</p>  
<p>string-2 : ${fn:escapeXml(string2)}</p>  
  
<p>Without escapeXml() Function:</p>  
<p>string-1 : ${string1}</p>  
<p>string-2 : ${string2}</p>
   <c:set var="str2" value="${fn:split(st, '-')}" />  
<c:set var="str3" value="${fn:join(str2, ' ')}" />  
    <c:out value="${str3}"></c:out>
  </body>
</html>
