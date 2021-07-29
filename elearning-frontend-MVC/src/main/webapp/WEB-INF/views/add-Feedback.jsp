<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Feedback</title>
</head>
<body>
	<h2>Feedback Registration</h2>
	<hr>
	<form:form action="register-feedback" method="POST" modelAttribute="feedback">
		<pre>
	Id   		 	  :<form:input path="feedbackUserId" />
			<br>
 	Name  			  :<form:input path="feedbackName" />
			<br>
 	Email 			  :<form:input path="feedbackEmail" />
			<br>
	Feedback Id 		  :<form:input path="feedbackId" /> 	
			<br>
	Feedback 		  :<form:input path="feedback" />
			<br>
 				  <input type="submit" value="Add Feedback" />  	<input type="reset"
				value="Reset" />
 	</pre>
	</form:form>
</body>
</html>