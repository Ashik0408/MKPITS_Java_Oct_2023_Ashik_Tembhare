<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List,com.mkpits.jdbc1.Student_Model"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Tracker App</title>
<link type="text/css" rel="stylesheet" href="css/style.css"> 
</head>
<%
//get the student the RequestDispatcher
List<Student_Model> theStudents = (List<Student_Model>) request.getAttribute("STUDENT_LIST");
%>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>MKPITS University</h2>
		</div>
	</div>

	<div id="container">
		<div id="content">
			<table>
				<tr>
					<th>Id</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
				<c:forEach var="tempStudent" items="${STUDENT_LIST}">
				<%-- <!-- set up link for each student -->
				<c:url var="tempLink" value="StudentControllerServletNew">
				<c:param name="command" value="LOAD"/>
				<C:param name="studentId" value="${tempStudent.id}"/></c:url> --%>
				<tr>
				<td>${tempStudent.id}</td>
				<td>${tempStudent.firstName}</td>
				<td>${tempStudent.lastName}</td>
				<td>${tempStudent.email}</td>
				<td><a href="${tempLink}">Update</a></td>			
				</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>