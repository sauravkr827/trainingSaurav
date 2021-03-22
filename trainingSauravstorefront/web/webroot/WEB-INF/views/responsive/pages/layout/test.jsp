    <%@ page trimDirectiveWhitespaces="true"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
        <%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>

        <template:page pageTitle="${pageTitle}">
            <cms:pageSlot position="SiteLogo" var="feature">
                <cms:component component="${feature}" />
            </cms:pageSlot>
            <div class="row no-margin">
            <div class="col-xs-12 col-md-6 no-space">
            <cms:pageSlot position="HeaderLinks" var="feature" element="div" class="row no-margin">
                <cms:component component="${feature}" element="div" class="col-xs-12 col-sm-6 no-space yComponentWrapper"/>
            </cms:pageSlot>
            </div>
            <div class="col-xs-12 col-md-6 no-space">
            <cms:pageSlot position="SearchBox" var="feature" element="div" class="row no-margin">
                <cms:component component="${feature}" element="div" class="col-xs-12 col-sm-6 no-space yComponentWrapper"/>
            </cms:pageSlot>
            </div>
            <div class="col-xs-12">
            <cms:pageSlot position="NavigationBar" var="feature" element="div" class="landingLayout2PageSection2C">
                <cms:component component="${feature}" element="div" class="yComponentWrapper"/>
            </cms:pageSlot>
            </div>
            </div>

            <cms:pageSlot position="MiniCartSlotTest" var="feature" element="div" class="row no-margin" >
                <cms:component component="${feature}" element="div" class="no-space yComponentWrapper"/>
            </cms:pageSlot>

            <cms:pageSlot position="FooterSlotTest" var="feature" element="div" class="row no-margin">
                <cms:component component="${feature}" element="div" class="col-xs-6 col-md-3 no-space yComponentWrapper"/>
            </cms:pageSlot>


        </template:page>
