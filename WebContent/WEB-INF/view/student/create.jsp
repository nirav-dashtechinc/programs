<%@page import="com.crud.entity.Student"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Student | Add</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	</head>
	<body>
		<div class="container">
			<h1>Add New Student</h1>
			<form action="add" method="POST">
				<table class="table">
					<tr>
						<td>Name</td>
						<td>
							<input type="text" class="form-control" name="name" placeholder="Enter your name">
						</td>
					</tr>
					
					<tr>
						<td>City</td>
						<td>
							<input type="text" class="form-control" name="city" placeholder="Enter your city">
						</td>
					</tr>
					
					<tr>
						<td></td>
						<td>
							<input class="btn btn-primary" type="submit" value="Save Changes" />
							<a class="btn btn-default" href="/servlet_hibernate_crud/students">Back</a>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</body>
</html>