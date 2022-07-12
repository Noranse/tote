<%@page import="java.util.Enumeration"%>
<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags/forms" prefix="fr"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="ui"%>
<%@taglib tagdir="/WEB-INF/tags/navbars" prefix="nb"%>
<%@taglib tagdir="/WEB-INF/tags/includes" prefix="in"%>

<in:html>
    <nb:navbar_authorization />
    <div class="container wrap">
        <fr:authorization_form />
    </div>
<%--
<ul>
<%
  Enumeration<String> en =  request.getAttributeNames();

  while (en.hasMoreElements()) {
%>
    <li><%=en.nextElement()%></li>
<%
  }
%>
</ul>

<ul>
<%
  Enumeration<String> en2 =  session.getAttributeNames();

  while (en2.hasMoreElements()) {
%>
    <li><%=en2.nextElement()%></li>
<%
  }
%>
</ul>
--%>
<ui:footer />
</in:html>