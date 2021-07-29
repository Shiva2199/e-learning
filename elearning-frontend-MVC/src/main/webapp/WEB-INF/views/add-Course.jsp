<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Course</title>
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
	<form:form action="register-course" method="POST" modelAttribute="course">
	<fieldset>
	<legend>Course Registration</legend>
		<pre>
	Course Id   		 	  :<form:input path="courseId" />
			<br>
 	Course Name  			  :<form:input path="courseName" />
			<br>
 	Description 			  :<form:input path="courseDesp" />
			<br>
	Fees 		  		  :<form:input path="courseFees" /> 	
			<br>
	Resources 		     	   :<form:input path="courseResources" /> 	
			<br>		
 				  <input type="submit" value="Add-Course" />  	<input type="reset"
				value="Reset" />
 	</pre>
 	</fieldset>
	</form:form>
</body>
</html>