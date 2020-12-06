<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
<h1>Help Url</h1>

<%

String name=(String)request.getAttribute("name");
Integer roll=(Integer)request.getAttribute("rollnumber");

%>
<h1>Name is <%=name %></h1>
<h1>Roll is <%=roll %></h1>
</body>
</html>