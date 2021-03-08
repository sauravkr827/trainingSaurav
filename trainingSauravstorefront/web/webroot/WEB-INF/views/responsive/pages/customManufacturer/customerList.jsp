<%--
  Created by IntelliJ IDEA.
  User: saurav
  Date: 3/4/2021
  Time: 5:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>

    <style>
        #newCustomer
        {
        alignment: left;
        }
        #oldCustomer
        {
            alignment: right;
            position: absolute;
            top:135px;
            right:200px;
        }
    </style>
</head>
<body>
<br>
<center><h1>List Of Customer</h1></center>

<hr>
<br>

<table border="1px" id="newCustomer" width="300px" height="400px">
    <tr bgcolor="#5f9ea0">
        <th>CustomerID</th>
        <th>CustomerName</th>
        <th>CustomerCreated</th>
        <th>CustomerNewOrOld</th>
    </tr>
    <c:forEach items="${list}" var="dt">
        <c:if test="${dt.newCustomer==true}">
        <tr align="center">
            <td>${dt.customerId}</td>
            <td>${dt.customerName}</td>
            <td>${dt.customerCreated}</td>
            <td>New Customer</td>
        </tr> </c:if>
    </c:forEach>
</table>



    <table border="1px" id="oldCustomer"  width="300px" height="400px">
        <tr bgcolor= #6495ed>
            <th>CustomerID</th>
            <th>CustomerName</th>
            <th>CustomerCreated</th>
            <th>CustomerNewOrOld</th>
        </tr>
        <c:forEach items="${list}" var="dt">
            <c:if test="${dt.newCustomer==false}">
                <tr align="center">
                    <td>${dt.customerId}</td>
                    <td>${dt.customerName}</td>
                    <td>${dt.customerCreated}</td>
                    <td>Old Customer</td>
                </tr> </c:if>
        </c:forEach>
    </table>



</body>
</html>
