<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app>
<head>
	<title>Cat show</title>
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js"></script>
	<script src="cats.js"></script>
</head>
<body>
	<h1>Show cats here!</h1>
	<div ng-controller="Cats">
		<ul class="cats-container">
			<table frame="border">
				Cats in the database: {{cats.length}}st.<br/>
				<th>Id</th><th>Name</th><th>Description</th>
			  	<tr ng-repeat="cat in cats">
			    <td>{{ cat.id }}</td>
			    <td>{{ cat.name }}</td>
			    <td>{{ cat.description }}</td>
			  </tr>
			</table>
		</ul>
	</div>
	
	</body>
</html>