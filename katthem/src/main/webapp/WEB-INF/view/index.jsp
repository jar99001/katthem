<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<html>
<body>
<h2>Welcome to cat sanctuary.</h2>
<a href="showCats.html">Show all cats</a><br/>
<a href="addCat.html">Add a cat</a><br/>
<a href="addSavior.html">Register savior</a><br/>
<a href="loginSavior.html">Login</a><br/></br>
<a href="logoutSavior.html">Logout</a>
<br/>
Logged in as: ${loggedIn.name}
</body>
</html>

