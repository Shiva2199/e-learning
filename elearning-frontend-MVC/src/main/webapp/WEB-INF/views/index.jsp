<%@ page isELIgnored="false"%>


<html>
<title>Home page</title>
	<link rel="stylesheet" type="text/css" href="style.css">
	<head>
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
	<h2>${message }</h2>
	<hr>
<!--  	<a href="user-list">Users</a> -->
<!--	<a href="admin-list">Admins</a>	-->
<!--	<a href="contact-list">Contacts</a> -->
<!--	<a href="course-list">Courses</a>	-->
<!--	<a href="feedback-list">Feedbacks</a>	-->
		<hr>
	<a href="LoginUser">User Login</a>
			<hr>
	<a href="LoginAdmin">Admin Login</a>
	<hr>
</body>
</html>
