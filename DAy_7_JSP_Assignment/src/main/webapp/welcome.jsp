<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
 Cookie[] x = request.getCookies();
for(int i = 0 ;i<x.length;i++){
	String m = x[i].getName();
	String z = x[i].getValue();
	out.println(m+" ..."+x.length+"... "+z);
	out.println("<br>");
}

%>
</body>
</html>