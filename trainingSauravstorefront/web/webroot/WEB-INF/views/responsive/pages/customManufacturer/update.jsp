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
    <h1>Update Form</h1>
    <hr>
    <br> <font color="#5f9ea0">${msg} </font>
    <c:url value="/updateSave" var="formUrl"/>
    <form:form modelAttribute="model" action="${formUrl}" method="post">

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
</center>

</body>
</html>
