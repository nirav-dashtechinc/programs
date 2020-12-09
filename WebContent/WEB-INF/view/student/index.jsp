<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Students</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	</head>
	<body>
		<div class="container">
			<h1>Students</h1>
			<a class="btn btn-primary" href="student/add">Add New Student</a>
			<table class="table">
				<tr>
					<td>Id</td>
					<td>Name</td>
					<td>City</td>
					<td>Action</td>
				</tr>
				<c:forEach items="${students}" var="student">
					<tr>
						<td>${student.id}</td>
						<td>${student.name}</td>
						<td>${student.city}</td>
						<td>
							<a class="btn btn-primary" href="student/edit?id=${student.id}">Edit</a>
							<a class="btn btn-danger" href="student/delete?id=${student.id}" onclick="return confirm('Are you sure to delete?');">Delete</a>
						</td>
					</tr>
				</c:forEach>			
			</table>
		</div>
	</body>
</html>