<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Contact</title>
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
	<hr>
	<form:form action="register-contact" method="POST" modelAttribute="contact">
		<fieldset>
		<legend>Contact Registration</legend>
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
 	</fieldset>
	</form:form>
</body>
</html>