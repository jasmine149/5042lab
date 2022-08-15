<%--
  Created by IntelliJ IDEA.
  User: jiangyue
  Date: 2022/8/14
  Time: 22:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Search Result</title>
</head>
<body>
<div align="center">
    <h2>Search Result</h2>
    <table border="1" cellpadding="5">
        <tr>
            <th>ID</th>
            <th>persistingRoom Name</th>
            <th>persistingRoom Type</th>
            <th>persistingRoom Floor</th>
        </tr>
<c:forEach items="${result}" var="persistingRoom">
    <tr>
    <td>${persistingRoom.id}</td>
    <td>${persistingRoom.roomname}</td>
    <td>${persistingRoom.roomtype}</td>
    <td>${persistingRoom.roomfloor}</td>
    </tr>
        </c:forEach>
    </table>
</div>
    </body>
</html>
