<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Secondserv">
<c:forEach var="str" items="${list}">
	<input type=checkbox name=ch value=${str}>${str}<br>
</c:forEach>
<input type=submit value="Add to Cart" >
</form>

</body>
</html>