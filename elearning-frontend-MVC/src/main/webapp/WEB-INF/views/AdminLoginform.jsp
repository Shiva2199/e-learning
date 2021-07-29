<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<title>Login Page</title>
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

body {
	background-color: lightyellow;
}
</style>
</head>

<body>
	<form:form action="LoginServletAdmin" method="POST"
		modelAttribute="login">
		<fieldset>
			<legend>Eneter Admin Credentials</legend>
			<pre>
		Please enter  ID    <form:input path="loginId" />
				<br>
						
		Please enter Email    <form:input path="email" />
			<br>		
		
		Please enter Password <form:password path="password" />
			<br>		
			<input type="submit" value="Login" />			
		</pre>
		</fieldset>
	</form:form>
</body>
</html>