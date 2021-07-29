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
			<th>Name</th>
			<th>Email</th>
			<th>Feedback ID</th>
			<th>Feedback</th>
		</tr>
		<c:forEach var="feedback" items="${list }">
			<tr>
				<td>${feedback.getfeedbackUserId() }</td>
				<td>${feedback.getfeedbackName() }</td>
				<td>${feedback.getfeedbackEmail() }</td>
				<td>${feedback.getfeedbackId() }</td>
				<td>${feedback.getfeedback() }</td>
			</tr>
		</c:forEach>
	</table>
<hr>
<a href="adminloginpage">Admin Home </a>
</body>
</html>