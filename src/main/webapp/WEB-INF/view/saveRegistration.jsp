<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="Menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save Registration</title>
</head>
<body>
<h2>Enter the Values</h2>
<form action="saveServelet" method="post">
Name <input type="text" name="name"/>
City <input type="text" name="city"/>
Email <input type="text" name="email"/>
Mobile <input type="text" name="mobile"/>
<input type="submit" value="Save"/>
</form>
</body>
</html>