<%--
  Created by IntelliJ IDEA.
  User: saurav
  Date: 2/18/2021
  Time: 11:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>

    <table border="1px">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>City</th>
            <th>Country</th>
        </tr>
        <tr>
            <td>${data.id}</td>
            <td>${data.name}</td>
            <td>${data.city}</td>
            <td>${data.country.name}</td>
        </tr>
    </table>
</center>
</body>
</html>
