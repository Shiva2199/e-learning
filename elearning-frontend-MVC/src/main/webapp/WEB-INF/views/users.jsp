<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Users List</title>
</head>
<body>

	<table border="1">

		<tr>
			<th>ID</th>
			<th>UserName</th>
			<th>Phone</th>
			<th>Email</th>
			<th>Address</th>
			<th>RegDate</th>
			<th>Photo</th>
			<th>Actions</th>
		</tr>
		
		<c:forEach var="user" items="${list }">
			<tr>
				<td>${user.getId() }</td>
				<td>${user.getName() }</td>
				<td>${user.getPhone() }</td>
				<td>${user.getEmail() }</td>
				<td>${user.getAddress() }</td>
				<td>${user.getReg_date() }</td>
				<td>${user.getUpload_photo() }</td>
				<td><a href="<c:url value='/delete-user/${user.getId() }' />">Delete</a> 
				| <a href="<c:url value='/update-user/${user.getId() }' />">Update</a></td>
			</tr>
		</c:forEach>
	</table>
<hr>
<a href="addUser">Add User</a>
<hr>
</body>
</html>