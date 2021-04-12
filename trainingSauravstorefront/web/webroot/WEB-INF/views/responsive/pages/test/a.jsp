<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>


    <center><h1>Registration</h1></center>
    <hr>


   <font style="size: 16px;color: #0e90d2"> ${msg}</font>

    <form:form modelAttribute="data" action="postData" method="post">

        <table style="margin-left: 300px">
            <tr><td>Id : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <form:input path="id" placeholder="Id"/></td>
                <form:errors path="id"/>
            </tr>
            <tr><td>Name :&nbsp;&nbsp;
                <form:input path="name" placeholder="Enter Name"/></td>
                <form:errors path="name"/>
            </tr>
            <tr><td>City :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <form:input path="city" placeholder="Enter City"/></td>
                <form:errors path="city"/>
            </tr>
            <tr>
            </tr>
            <tr><td><input type="submit" value="Submit"/></td></tr>
        </table>

    </form:form>
