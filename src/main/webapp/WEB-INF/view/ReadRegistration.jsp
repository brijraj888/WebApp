<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="Menu1.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Read Registration</title>
</head>
<body>
<h2>Registration Table</h2>
<table border='2'>
<tr>
<th>Name</th>
<th>City</th>
<th>Email</th>
<th>Mobile</th>
<td>Delete</td>
<td>Update</td>
</tr>

<% ResultSet res = (ResultSet)request.getAttribute("result");
while(res.next()){%>
<tr>
<td><%out.println(res.getString(1));%></td>
<td><%out.println(res.getString(2));%></td>
<td><%out.println(res.getString(3));%></td>
<td><%out.println(res.getString(4));%></td>
<td><a href="delete?name=<%=res.getString(1)%>">Delete</a></td>
<td><a href="update?email=<%=res.getString(3)%>&mobile=<%=res.getString(4)%>">Update</a></td>
</tr>
<%}%>
</table>
</body>
</html>