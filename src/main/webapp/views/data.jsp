<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Students Data</title>
</head>
<body>

<h3>All Students List</h3>

<table border="1" cellpadding="10">
    
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Gender</th>
        <th>Course</th>
        <th>Timings</th>
    </tr>

    <c:forEach items="${data}" var="student">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.email}</td>
            <td>${student.gender}</td>
            <td>${student.course}</td>
            <td>${student.timings}</td>
        </tr>
    </c:forEach>

</table>

<br>
<a href="/">Back to Form</a>

</body>
</html>