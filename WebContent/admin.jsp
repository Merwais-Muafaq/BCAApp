<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 style="color:red">${message }</h3>
<h2 style="color:red">Wellcome to admin loginpage</h2>
<form action="adminLogin" method="post">
<label>Use Name</label>
<input type="text" name="userName"><br>
<label>Password</label>
<input type="password" name="password">
<input type="submit" value="Login">
<input type="reset" value="Reset">
</form>
</body>
</html>