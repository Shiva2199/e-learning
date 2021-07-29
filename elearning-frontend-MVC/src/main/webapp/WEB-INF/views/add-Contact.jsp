<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Contact</title>
</head>
<body>
	<h2>Contact Registration</h2>
	<hr>
	<form:form action="register-contact" method="POST" modelAttribute="contact">
		<pre>
	Id   		 	  :<form:input path="userId" />
			<br>
 	Name  			  :<form:input path="Name" />
			<br>
 	Email 			  :<form:input path="Email" />
			<br>
	Phone 		   :<form:input path="phoneNo" /> 	
			<br>
	Message 		   :<form:input path="messege" /> 	
			<br>
	Contact Id 		   :<form:input path="contactId" /> 	
			<br>
 				  <input type="submit" value="Register" />  	<input type="reset"
				value="Reset" />
 	</pre>
	</form:form>
</body>
</html>