<%--
  Created by IntelliJ IDEA.
  User: saurav
  Date: 3/11/2021
  Time: 12:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
   <h1>CustomerList</h1>
    <hr>
    <br>
<h1>No. of New Customer : ${size}</h1>
    <table border="1px">
        <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Customer Id</th>

        </tr>
        <c:forEach items="${list}" var="dt">
            <tr><td>${dt.displayUid}</td>
                <td>${dt.firstName}</td>
                <td>${dt.lastName}</td>
                <td>${dt.customerId}</td>
                <td>${dt.isNewCustomer}</td>

            </tr>
        </c:forEach>
    </table>
</center>

</body>
</html>
