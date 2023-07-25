<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import = "java.util.*,java.sql.*" %>
 
<% 
List<String> mylist = new ArrayList<>();
mylist.add("dac");
out.println(mylist);
%>
</body>
</html>