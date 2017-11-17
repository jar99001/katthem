<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add a new cat</title>
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
	<form:form commandName="catObj">
		<form:errors path="*" cssClass="errorBlock" element="div"/>
		<label for="textInput1">Name:</label>
		<form:input path="name" cssClass="error"/>
		<form:errors path="name" cssClass="error"/>

		<label for="textInput2">Description:</label>
		<form:input path="description" cssClass="error"/>
		<form:errors path="description" cssClass="error"/>

		<br>
		<input type="submit" class="btn" value="Add cat"/>
	</form:form>
</body>
</html>