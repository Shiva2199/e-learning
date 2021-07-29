<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin List</title>
<style>
table, th, td {
  border: 1px solid black;
   }
   table
   {
   border-collapse: collapse;
    border: 1px solid black; 
    width: 100%;
}
h2, h3, pre {text-align: center;}

body {
	
  background-color:  lightyellow ;
}
</style>
</head>
<body>

	<table border="1">

		<tr>
			<th>ID</th>
			<th>AdminName</th>
			<th>Email</th>
			<th>Actions</th>
		</tr>
		<c:forEach var="admin" items="${list }">
			<tr>
				<td>${admin.getAdminId() }</td>
				<td>${admin.getName() }</td>
				<td>${admin.getEmail() }</td>
				<td><a href="<c:url value='/delete-admin/${admin.getAdminId() }' />">Delete</a> 
				| <a href="<c:url value='/update-admin/${admin.getAdminId() }' />">Update</a></td>
			</tr>
		</c:forEach>
	</table>
<hr>
<a href="addAdmin">Add Admin</a>
<a href="addCourse">Add Course</a>
	<hr>
</body>
</html>