<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

<title>Login</title>
</head>
<body>
<div class="container">
<div class="col-md-4 m-auto">
<h1 align="center" class="text-success">Login Form</h1>
<form action="login" method="post">
<span class="text-success">${err}</span>
<span class="text-danger">${msg}</span>
<div class="form-group">
<label>Username</label>
<input type="text" name="uname" placeholder="Enter username" class="form-control">
</div>
<div class="form-group">
<label>Password</label>
<input type="text" name="pass" placeholder="Enter password" class="form-control">
<br>
<div class="form-group">
<input type="submit" class="btn btn-success">
</form>
</div>
</div>
</body>
</html>