<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login a savior.</title>
<style type="text/css">
	.error {
		color:#ff0000;
	}
	.errorBlock {
		color:#000;
		background-color:#ffEEEE;
		border: 3px solid #ff0000;
		padding: 8px;
		margin: 16px;
	}
	
</style>
</head>
<body>
	<h1>Login Savior</h1>
	<form:form commandName="savior">
		<form:errors path="*" cssClass="errorBlock" element="div"/>
		<label for="textInput1">Name:</label>
		<form:input path="name" cssClass="error"/>
		<form:errors path="name" cssClass="error"/>

		<label for="textInput2">Password:</label>
		<form:input type="password" path="password" cssClass="error"/>
		<form:errors path="password" cssClass="error"/><br/>
		<br>
		<input type="submit" class="btn" value="Login"/>
	</form:form>
</body>
</html>