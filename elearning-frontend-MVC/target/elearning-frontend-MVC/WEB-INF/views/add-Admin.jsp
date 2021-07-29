<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Admin</title>
</head>
<body>
	<h2>Admin Registration</h2>
	<hr>
	<form:form action="register-admin" method="POST" modelAttribute="admin">
		<pre>
	Id   		 	  :<form:input path="adminId" />
			<br>
 	Name  			  :<form:input path="Name" />
			<br>
 	Email 			  :<form:input path="Email" />
			<br>
	Password 		   :<form:password path="password" /> 	
			<br>
 				  <input type="submit" value="Register" />  	<input type="reset"
				value="Reset" />
 	</pre>
	</form:form>
</body>
</html>