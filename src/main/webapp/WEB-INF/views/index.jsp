<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/sketchy/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="main.css">
</head>
<body>
	<h1>This is Grand Coffee Shop!</h1>
	<a href="register">Sign Up</a><br><br>
	
	
	<div class="container">

		<form action="search">
			ID: <input type="text" name="itemid"> <input type="submit"
				value="Search">

		</form><br>

	<div class="tablestyle">
		<table class="table">
			<thead>
			<tr>
				<th>ID
				<th>Name</th>
				<th>Description</th>
				<th>Quantity</th>
				<th>Price</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${coffee}" var="f">
					<tr>
						<td>${f.id} </td>
						<td>${f.name}</td>
						<td>${f.description}</td>
						<td>${f.quantity}</td>
						<td>${f.price}</td>
					</tr>

				</c:forEach>
			</tbody>
		</table>
		
	</div>
	
	</div>
</body>
</html>