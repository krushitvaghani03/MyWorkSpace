<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>

	<form:form action="addStudent" modelAttribute="student">
	<form:hidden path="id"/>
		<form:label path="name">Username</form:label>
		<form:input path="name" />
		<form:label path="email">Email</form:label>
		<form:input path="email" />
		
		<input type="submit">

	</form:form>
	
	<h1>Student List</h1>
		<table border="1">
		<tr>
		<td>Id</td>
		<td>Name</td>
		<td>Email</td>
		<td colspan="2">Action</td>
		</tr>
		
		<c:forEach var="dt" items="${data}">
		<tr>
		<td>${dt.getId()}</td>
		<td>${dt.getName()}</td>
		<td>${dt.getEmail()}</td>
		<td><a href="delete?did=${dt.getId()}">Delete</a></td>
		<td><a href="update?uid=${dt.getId()}">Update</a></td>
		
		</tr>
		</c:forEach>
		
		</table>

</body>
</html>