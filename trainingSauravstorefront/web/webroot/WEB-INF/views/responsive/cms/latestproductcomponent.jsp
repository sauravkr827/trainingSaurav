<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product" %>




<div class="product__listing product__grid">
    <c:forEach items="${data}" var="product" varStatus="status">
        <product:productListerGridItem product="${product}" />
    </c:forEach>
</div>



<cms:pageSlot position="offer" var="feature" element="div" class="row no-margin">
    <cms:component component="${feature}" element="div" class="col-xs-6 col-md-3 no-space yComponentWrapper"/>
</cms:pageSlot>