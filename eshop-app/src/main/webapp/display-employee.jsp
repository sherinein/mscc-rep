<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="nav.html" /> 
	<h2> Employee Details</h2>
	<input type="button" 
		  value="Add Employee" 
		  onclick="window.location.href='add-employee.jsp';return false;"
	       />
	<table border="1">
	<tr>
		<th>Employee Id</th>
		<th>Employee Name</th>
		<th>Employee Salary</th>
	</tr>
		<c:forEach var="employee" items="${employees}">
	<tr>
		<td>${employee.id} </td>
		<td>${employee.ename} </td>
		<td>${employee.salary} </td>
	</tr>
	</c:forEach>

 </table>	
</body>
</html>