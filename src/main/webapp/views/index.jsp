<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<body>

<h3>Student Form</h3>

<font color = 'green'>${msg}</font>

<form:form action="save" modelAttribute="student" method="post">

<table>

<tr>
    <td>Name:</td>
    <td><form:input path="name"/></td>
</tr>

<tr>
    <td>Email:</td>
    <td><form:input path="email"/></td>
</tr>

<tr>
    <td>Gender:</td>
    <td>
        <form:radiobutton path="gender" value="Male"/> Male
        <form:radiobutton path="gender" value="Female"/> Female
    </td>
</tr>

<tr>
    <td>Course:</td>
    <td>
        <form:select path="course">
            <form:option value="">-Select-</form:option>
            <form:options items="${courses}"/>
        </form:select>
    </td>
</tr>

<tr>
    <td>Timings:</td>
    <td>
        
            <form:checkboxes items="${Timings}" path = "timings"/>
    </td>
</tr>


<tr>
    <td></td>
    <td><input type="submit" value="Save"/></td>
</tr>

</table>

</form:form>
<a href = "viewstudents" >view students</a>

</body>
</html>