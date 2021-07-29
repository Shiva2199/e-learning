<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Feedback List</title>
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
			<th>Name</th>
			<th>Email</th>
			<th>Feedback ID</th>
			<th>Feedback</th>
			<th>Actions</th>
		</tr>
		<c:forEach var="feedback" items="${list }">
			<tr>
				<td>${feedback.getfeedbackUserId() }</td>
				<td>${feedback.getfeedbackName() }</td>
				<td>${feedback.getfeedbackEmail() }</td>
				<td>${feedback.getfeedbackId() }</td>
				<td>${feedback.getfeedback() }</td>
				<td><a href="<c:url value='/delete-feedback/${feedback.getfeedbackUserId() }' />">Delete</a> 
				| <a href="<c:url value='/updateFeedback/${feedback.getfeedbackId() }' />">Update</a></td>
			</tr>
		</c:forEach>
	</table>
<hr>
<a href="addFeedback">Add Feedback</a>
</body>
</html>