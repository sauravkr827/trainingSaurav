<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<template:page pageTitle="${pageTitle}">
    <cms:pageSlot position="latestProductSlotName1" var="feature" element="div" class="span-24 section5 cms_disp-img_slot">
    <cms:component component="${feature}" />
</cms:pageSlot>

    <jsp:include page="a.jsp"/>

    <h1>sakkkkkkkkkkkkk</h1>

    <cms:pageSlot position="testBanner" var="feature" element="div" class="span-24 section5 cms_disp-img_slot">
        <cms:component component="${feature}" />
    </cms:pageSlot>

</template:page>