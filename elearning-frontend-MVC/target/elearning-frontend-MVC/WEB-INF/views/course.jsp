<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Course List</title>
</head>
<body>

	<table border="1">

		<tr>
			<th>ID</th>
			<th>CourseName</th>
			<th>Description</th>
			<th>Fees</th>
			<th>Resources</th>
			<th>Actions</th>
		</tr>
		<c:forEach var="course" items="${list }">
			<tr>
				<td>${course.getCourseId() }</td>
				<td>${course.getCourseName() }</td>
				<td>${course.getCourseDesp() }</td>
				<td>${course.getCourseFees() }</td>
				<td>${course.getCourseResources() }</td>
				<td><a href="<c:url value='/delete-course/${course.getCourseId() }' />">Delete</a> 
				| <a href="<c:url value='/update-course/${course.getCourseId() }' />">Update</a></td>
			</tr>
		</c:forEach>
	</table>
<hr>
<a href="addCourse">Add Course</a>
</body>
</html>