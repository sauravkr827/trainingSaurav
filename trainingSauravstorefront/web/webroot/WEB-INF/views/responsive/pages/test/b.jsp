<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>



<template:page pageTitle="${pageTitle}">
    <cms:pageSlot position="Section1" var="feature">
        <cms:component component="${feature}" />
    </cms:pageSlot>
    <center>
        <br>
        <br>
       <h1 style="color: #0e90d2">${msg}</h1>
        <br>
        <br>
    </center>

</template:page>