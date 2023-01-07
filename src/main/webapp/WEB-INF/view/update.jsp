<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Registration</title>
</head>
<body>
<h2>Enter the mobile to be Updated</h2>
<form action="update" method="post">
Email <input type="text" name="email"/>
Mobile <input type="text" name="mobile"/>
<input type="submit" value="Update"/>
</form>
</body>
</html>