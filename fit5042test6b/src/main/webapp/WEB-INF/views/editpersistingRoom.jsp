<%--
  Created by IntelliJ IDEA.
  User: jiangyue
  Date: 2022/8/14
  Time: 22:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Edit persistingRoom</title>
</head>
<body>
<div align="center">
    <h2>Edit persistingRoom</h2>
    <form:form action="save" method="post" modelAttribute="persistingroom">
    <table border="0" cellpadding="5">
        <tr>
            <td>ID: </td>
        <td>${persistingRoom.id}
            <form:hidden path="id"/>
        </td>
        </tr>
        <tr>
            <td>persistingRoom Name: </td>
            <td><form:input path="roomname" /></td>
        </tr>
        <tr>
            <td>persistingRoom Type: </td>
            <td><form:input path="roomtype" /></td>
        </tr>
        <tr>
            <td>persistingRoom Floor: </td>
            <td><form:input path="roomfloor" /></td>
        </tr>
        <tr>
        <td colspan="2"><input type="submit" value="Save"></td>
        </tr>
    </table>
</form:form>
</div>
</body>
</html>
