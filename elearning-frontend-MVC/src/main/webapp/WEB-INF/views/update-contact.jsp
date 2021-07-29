<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Contact Form</title>
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
	<h2>Update Contact</h2>
	<hr>
	<c:url var="updateUrl" value="/update-contact"></c:url>
	<form:form action="${updateUrl }" method="post" modelAttribute="contact">
		<pre>
	User Id 		   :<form:input path="userId" readonly="true" /> 	
			<br>
 	Name  			  :<form:input path="Name" />
			<br>
 	Email 			  :<form:input path="Email" />
			<br>
	Phone 		   	  :<form:input path="phoneNo" /> 	
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