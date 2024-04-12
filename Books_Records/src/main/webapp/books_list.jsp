<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.mkpits.bookrecords.Book_Model"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="wrapper">
		<div id="header">
			<h2>Books List Records</h2>
		</div>
	</div>

	<div id="container">
		<div id="content">
			<table>
				<tr>
					<th>Id</th>
					<th>Title</th>
					<th>Author</th>
				</tr>
				<c:forEach var="book" items="${Books_List}">
				<tr>
				<td>${book.id}</td>
				<td>${book.title}</td>
				<td>${book.author}</td>			
				</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>