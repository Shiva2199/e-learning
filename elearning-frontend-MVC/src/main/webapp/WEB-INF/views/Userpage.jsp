<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Welcome Page</title>
<link rel="stylesheet" type="text/css" href="style.css">
<style>
table, th, td {
	border: 1px solid black;
}

table {
	border-collapse: collapse;
	border: 1px solid black;
	width: 100%;
}

h2, h3, pre {
	text-align: center;
}

.mydiv {
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

			<h2>Welcome</h2>

			<a href="courselist">Courses</a>
			<hr>
			<a href="feedback-list">Feedbacks</a>
		</fieldset>
	</div>
</body>
</html>