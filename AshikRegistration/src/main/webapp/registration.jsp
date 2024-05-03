<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="css/registration.css"> 
</head>
<body>
<div class="container">
    <h1>Registration</h1>
    <form action="MyRegisterController" method="get">
      <label for="id">ID:</label>
      <input type="text" id="id" name="id" required>

      <label for="name">Name:</label>
      <input type="text" id="name" name="name" required>

      <label for="username">Username:</label>
      <input type="text" id="username" name="username" required>

      <label for="email">Email:</label>
      <input type="email" id="email" name="email" required>

      <label for="mob_no">Mobile Number:</label>
      <input type="text" id="mob_no" name="mob_no" required>

      <label for="city">City:</label>
      <input type="text" id="city" name="city" required>

      <label for="password">Password:</label>
      <input type="password" id="password" name="password" required>
      
      <label for="cpassword">Confirm Password:</label>
      <input type="password" id="cpassword" name="cpassword" required>

      <input type="submit" value="Register">
    </form>
  </div>

</body>
</html>