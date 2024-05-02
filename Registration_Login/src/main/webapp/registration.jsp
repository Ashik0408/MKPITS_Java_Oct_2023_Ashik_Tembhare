<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="RegistrationServlet" method="get">
		<h2>Registration Form</h2>
		<label for="name">Name</label> <input type="text" name="name"><br>
		<br> <label for="uname">Username</label> <input type="text" name="uname"><br>
		<br> <label for="mob_no">Mobile No</label> <input type="tel" name="mob"><br>
		<br> <label for="email">Email</label> <input type="email" name="email"><br>
		<br> <label for="city">City</label> <input type="text" name="city"><br>
		<br> <label for="gender">Gender</label> <input type="text" name="gen"><br>
		<br> <label for="password">Password</label> <input
			type="password" name="pass"><br>
		<br> <label for="c_password">Confirm Password</label> <input
			type="password" name="cpass"><br>
		<br> <input type="submit" value="Submit">
	</form>
</body>
</html>