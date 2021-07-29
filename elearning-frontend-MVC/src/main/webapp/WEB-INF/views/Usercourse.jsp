<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Course List</title>
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
			<th>CourseName</th>
			<th>Description</th>
			<th>Fees</th>
			<th>Resources</th>
		</tr>
		<c:forEach var="course" items="${list }">
			<tr>
				<td>${course.getCourseId() }</td>
				<td>${course.getCourseName() }</td>
				<td>${course.getCourseDesp() }</td>
				<td>${course.getCourseFees() }</td>
				<td>${course.getCourseResources() }</td>
			</tr>
		</c:forEach>
	</table>
	<hr>
	<a href="feedback-list">Feedbacks</a>
</body>
</html>