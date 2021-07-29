<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Feedback Form</title>
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
	<h2>Update Feedback</h2>
	<hr>
	<c:url var="updateUrl" value="/updateFeedback"></c:url>
	<form:form action="${updateUrl }" method="post" modelAttribute="feedback">
			<pre>
	Id   		 	  :<form:input path="feedbackUserId" readonly />
			<br>
 	Name  			  :<form:input path="feedbackName" />
			<br>
 	Email 			  :<form:input path="feedbackEmail" />
			<br>
	Feedback Id 		  :<form:input path="feedbackId" /> 	
			<br>
	Feedback 		  :<form:input path="feedback" />
			<br>
 				  <input type="submit" value="Update Feedback" />  	<input type="reset"
				value="Reset" />
 	</pre>
	</form:form>
</body>
</html>