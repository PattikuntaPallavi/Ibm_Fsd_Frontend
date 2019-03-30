<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ page language="java" contentType="text/html" %>
<%@ page import="java.util.*" %>
    <%@page import="com.employee.management.EmployeeServiceImpl" %>
    <%@page import="java.util.List,java.util.ArrayList" %>
    <%@page import="com.employee.management.Employee" %>
    <%@page import="java.util.Iterator"%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<h3 align="center">Welcome User:<%  out.println(session.getAttribute("userName"));%></h3>
<h2>EMPLOYEE LANDING PAGE</h2>
<br><br>
<a href="addEmployee.jsp">Add Employee Data</a><br><br>
<a href="listEmployee.jsp">List Employee Data</a><br><br>
<a href="index.jsp" >Home</a><br><br>


</body>
</html>