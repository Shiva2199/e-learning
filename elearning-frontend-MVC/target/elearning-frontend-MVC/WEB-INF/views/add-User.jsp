<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Registration</title>
</head>
<body>
	<h2>User Registration</h2>
	<hr>
	<form:form action="register" method="POST" modelAttribute="user">
		<pre>
	Id   		 	  :<form:input path="Id" />
			<br>
 	Name  			  :<form:input path="Name" />
			<br>
 	Phone Number 		  :<form:input path="phone" />
			<br>	
 	Email 			  :<form:input path="Email" />
			<br>
 	Address			  :<form:input path="Address" />
			<br>
 	RegDate(dd/mm/yyyy)	  :<form:input path="Reg_date" />
			<br>
 	Password		  :<form:password path="Password" />
			<br>
 	Photo 			  :<form:input path="upload_photo" />
			<br>
 				  <input type="submit" value="Register" />  	<input type="reset"
				value="Reset" />
 	</pre>
	</form:form>
</body>
</html>