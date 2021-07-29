<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Feedback List</title>
</head>
<body>

	<table border="1">

		<tr>
			<th>ID</th>
			<th>AdminName</th>
			<th>Email</th>
			<th>Feedback ID</th>
			<th>Feedback</th>
			<th>Actions</th>
		</tr>
		<c:forEach var="feedback" items="${list }">
			<tr>
				<td>${feedback.getUserId() }</td>
				<td>${feedback.getName() }</td>
				<td>${feedback.getEmail() }</td>
				<td>${feedback.getFId() }</td>
				<td>${feedback.getFeedback() }</td>
				<td><a href="<c:url value='/delete-feedback/${feedback.getUserId() }' />">Delete</a> 
				| <a href="<c:url value='/update-feedback/${feedback.getUserId() }' />">Update</a></td>
			</tr>
		</c:forEach>
	</table>
<hr>
<a href="addFeedback">Add Feedback</a>
</body>
</html>