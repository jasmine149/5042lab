<%--
  Created by IntelliJ IDEA.
  User: jiangyue
  Date: 2022/8/14
  Time: 22:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>persistingRoom Manager</title>
</head>
<body>
<div align="center">
    <h2>persistingRoom Manager</h2>
    <form method="get" action="search">
        <input type="text"name="keyboard"/>&nbsp;
        <input type="submit" value="Search" />
    </form>
    <h3><a href="${pageContext.request.contextPath}/new">New persistingRoom</a></h3>
    <table border="1" cellpadding="5">
        <tr>
            <th>ID</th>
            <th>persistingRoom Name</th>
            <th>persistingRoom Type</th>
            <th>persistingRoom Floor</th>
            <th>Action</th>
        </tr>
<c:forEach items="${listpersistingRoom}" var="persistingRoom">
    <tr>
    <td>${persistingRoom}</td>
    <td>${persistingRoom.roomname}</td>
    <td>${persistingRoom.roomtype}</td>
    <td>${persistingRoom.roomfloor}</td>
    <td>
    <a href="${pageContext.request.contextPath}/edit?id=${persistingRoom.id}">Edit</a>a>
    &nbsp;&nbsp;&nbsp;
        <a href="
${pageContext.request.contextPath}/delete?id=${persistingRoom.id}">Delete</a>a>
    </td>
    </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
