<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- create simple data......normally it is provided by mvc -->
<% 
String [] cities={"Mumbai","Pune","Nagpur"};
pageContext.setAttribute("myCities", cities);
%>
<c:forEach var="tempCity" items="${myCities}"><h1>${tempCity}</h1>
<br>
</c:forEach>
</body>
</html>