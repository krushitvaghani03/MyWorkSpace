<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
<span>${msg}</span>
<form action="reg" method="get">
		<input type="hidden" name="id" value="${data.getId()}">
		 <input type="text" name="name" placeholder="enter emploee name"
			value="${data.getName()}"> 
			<input type="text" name="email"
			placeholder="enter employee email" value="${data.getEmail()}">
		<input type="text" name="dept" placeholder="enter employee dept"
			value="${data.getDept()}"> <input type="submit">
	</form>
	<a href="display">view all Data</a>
</body>
</html>