<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List , com.mkpits.model.Student"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Data</title>
</head>
<body>
	<%
	//List<Student> data=new ArrayList<Student>();
	List<Student> data = new ArrayList<Student>();
	data.add(new Student("Vinay","Thawre",false));
	data.add(new Student("kaustubh","anjankar",true));
	
	pageContext.setAttribute("myStudent",data);
	%>
	<c:forEach var="tempStudent" items="${myStudent}">
	${tempStudent.firstName}${tempStudent.lastName}${tempStudent.isGoldCustomer}
	<br>
	</c:forEach>
</body>
</html>