<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: saurav
  Date: 2/18/2021
  Time: 11:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pagination</title>
</head>
<body>

<center>
    <h1>Pagination</h1>
    <hr>

    <table border="1px">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>City</th>
            <th>Country</th>
        </tr>
        <c:forEach items="${data}" var="dt">
            <tr>
                <td>${dt.id}</td>
                <td>${dt.name}</td>
                <td>${dt.city}</td>
                <td>${dt.country.name}</td>
            </tr>
        </c:forEach>
    </table>
</center>

<br>
<button> <a href="pagination/0"/>1 </button>
</body>
</html>
