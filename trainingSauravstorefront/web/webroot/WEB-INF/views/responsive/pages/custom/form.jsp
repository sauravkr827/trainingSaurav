<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <center>
        <div class="registration">
            <h1>Registration Page</h1>
            <hr>
            <form:form modelAttribute="model1" action="saveData" method="post">

            <table style="margin-left: 300px" border="1px" width="100px">
                <tr style="width:60px"><td>Id :</td>
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
                <tr><td><input type="submit" value="Submit" style="width: 100px; color:darkslategrey "/></td></tr>
            </table>

            </form:form>

            <h3>${error}</h3>
    </center>
    </div>

