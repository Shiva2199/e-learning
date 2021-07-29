<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact List</title>
</head>
<body>

	<table border="1">

		<tr>
			<th>ID</th>
			<th>AdminName</th>
			<th>Email</th>
			<th>Phone</th>
			<th>Message</th>
			<th>Contact ID</th>
			<th>Actions</th>
		</tr>
		<c:forEach var="contact" items="${list }">
			<tr>
				<td>${contact.getUserId() }</td>
				<td>${contact.getName() }</td>
				<td>${contact.getEmail() }</td>
				<td>${contact.getPhoneNo() }</td>
				<td>${contact.getMessege() }</td>
				<td>${contact.getContactId() }</td>
				<td><a href="<c:url value='/delete-contact/${contact.getUserId() }' />">Delete</a> 
				| <a href="<c:url value='/update-contact/${contact.getContactId() }' />">Update</a></td>
			</tr>
		</c:forEach>
	</table>
<hr>
<a href="addContact">Add Contact</a>
</body>
</html>