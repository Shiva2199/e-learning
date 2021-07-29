<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
            <meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
		<title>Login Page</title>
	</head>

	<body>
		<form:form action="LoginServletAdmin" method="POST" modelAttribute="login">
		<pre>
			Please enter your ID 		
			<form:input path="loginId" /><br>
			Please enter your Email 		
			<form:input path="email" /><br>		
		
			Please enter your Password
			<form:password path="password"/>
			<br>	
			<input type="submit" value="submit" />			
		</pre>
		</form:form>
	</body>
</html>