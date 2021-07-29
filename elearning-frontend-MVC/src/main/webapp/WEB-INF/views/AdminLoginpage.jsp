<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
<style>
table, th, td {
	border: 1px solid black;
}

table {
	border-collapse: collapse;
	border: 1px solid black;
	width: 100%;
}
.mydiv{
	text-align: center;
}
h2, h3, pre {
	text-align: center;
}

body {
	background-color: lightyellow;
}
</style>
</head>
<body>
	<div class="mydiv">
		<fieldset>
			<legend>Welcome to Admin Page</legend>
			<a href="user-list">Users</a>
			<hr>
			<a href="admin-list">Admins</a>
			<hr>
			<a href="contact-list">Contacts</a>
			<hr>
			<a href="course-list">Courses</a>
			<hr>
			<a href="admin-feedback-list">Feedbacks</a>
			<hr>
			<a href="">Home Page</a>
		</fieldset>
	</div>

</body>
</html>