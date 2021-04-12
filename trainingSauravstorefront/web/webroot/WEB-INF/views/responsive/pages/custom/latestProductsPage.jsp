<%--
  Created by IntelliJ IDEA.
  User: Trainee
  Date: 4/1/2021
  Time: 12:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<template:page pageTitle="${pageTitle}">
    <cms:pageSlot position="LatestProductSlotName11" var="feature" element="div" class="span-24 section5 cms_disp-img_slot">
        <cms:component component="${feature}" />
    </cms:pageSlot>


    <cms:pageSlot position="offer" var="feature" element="div" class="row no-margin">
        <cms:component component="${feature}" element="div" />
    </cms:pageSlot>


    <h3>CMSParagraphComponent</h3>

    <cms:pageSlot position="content" var="feature" element="div" class="row no-margin">
        <cms:component component="${feature}" element="div" />
    </cms:pageSlot>



m


</template:page>
