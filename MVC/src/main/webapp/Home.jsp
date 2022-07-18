<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
<%
String uname = (String) session.getAttribute("uname");
if(uname == null)
{
	request.setAttribute("err","Please Login First!!!");
	request.getRequestDispatcher("login.jsp").forward(request, response);
}

%>

<h1 align="center">Home</h1>
<h2 align="center">Welcome, <%=uname%> | <a href="logout">Logout</a></h2>
<h3 align="center"><a href="product" class="btn btn-success">Go To Product</a></h3>
</body>
</html>