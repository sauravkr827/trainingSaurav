<%--
  Created by IntelliJ IDEA.
  User: saurav
  Date: 2/22/2021
  Time: 11:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isErrorPage = "true" %>

<html>
<head>
    <title>Registration Form</title>
</head>
<body>
<center>
<h1>Registration Form</h1>
    <hr>
    <br> <font color="#5f9ea0">${msg} </font>
<form:form modelAttribute="model" action="saveData" method="post">

    <table>
        <tr><td>Id :</td>
            <td><form:input path="id" placeholder="Id"/></td>
            <form:errors path="id"/>
        </tr>
        <tr><td>Name :</td>
            <td><form:input path="name" placeholder="Enter Name"/></td>
            <form:errors path="name"/>
        </tr>
        <tr><td>City :</td>
            <td><form:input path="city" placeholder="Enter City"/></td>
            <form:errors path="city"/>
        </tr>
        <tr>
        </tr>
        <tr><td bgcolor="#6495ed"><input type="submit" value="Submit"/></td></tr>
    </table>

</form:form>

   <%-- <h1>Opps...</h1>
    <table width = "100%" border = "1">
        <tr>
            <td width = "40%"><b>Error:</b></td>
            <td>${pageContext.exception}</td>
        </tr>

        <tr>
            <td><b>URI:</b></td>
            <td>${pageContext.errorData.requestURI}</td>
        </tr>

        <tr>
            <td><b>Status code:</b></td>
            <td>${pageContext.errorData.statusCode}</td>
        </tr>

        <tr>
            <td><b>Stack trace:</b></td>
            <td>
                <c:forEach var = "trace"
                           items = "${pageContext.exception.stackTrace}">
                    <p>${trace}</p>
                </c:forEach>
            </td>
        </tr>
    </table>--%>
</center>

</body>
</html>
