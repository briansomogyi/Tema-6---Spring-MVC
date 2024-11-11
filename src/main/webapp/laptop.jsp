<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Laptop page for the Spring MVC Web App</h1>
		<p>My laptop is: Laptop(<c:out value="${b}" />, <c:out value="${p}" />, <c:out value="${r}" />)</p>
	</body>
</html>