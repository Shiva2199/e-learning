<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update User Form</title>
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
	<h2>Update User</h2>
	<hr>
	<c:url var="updateUrl" value="/update-user"></c:url>
	<form:form action="${updateUrl }" method="post" modelAttribute="user">
			<pre>
	Id   		 	  :<form:input path="Id" readonly />
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
 				  <input type="submit" value="Update User" />  	<input type="reset"
				value="Reset" />
 	</pre>
	</form:form>
</body>
</html>