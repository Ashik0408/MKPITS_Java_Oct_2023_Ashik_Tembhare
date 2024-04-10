<%@page import="com.mkpits.jdbc.Student"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Tracker App</title>
</head>
<%
// get the student the RequestDispatcher
List<Student> theStudents=(List<Student>)request.getAttribute("STUDENT_LIST");
%>
<body>
<div id="wrapper">
<div id="header">
<h2>MKPITS University</h2>
</div>
</div>

<div id="container">
<div id="content">
<table border="1">
	<tr>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Email</th>
	</tr>
<%
for(Student studList : theStudents)
{
%>
	<tr>
		<td><%=studList.getFirstName()%></td>
		<td><%=studList.getLastName()%></td>
		<td><%=studList.getEmail()%></td>
	</tr>
<%} %>
</table>
</div>
</div>
</body>
</html>