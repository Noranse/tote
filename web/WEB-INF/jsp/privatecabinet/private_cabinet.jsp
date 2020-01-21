<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags/privatecabinet" prefix="pc"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="ui"%>
<%@taglib tagdir="/WEB-INF/tags/includes" prefix="in"%>
<%@taglib tagdir="/WEB-INF/tags/navbars" prefix="nb"%>

<in:html>
    <nb:navbar-main />
    <pc:menu_private_cabinet/>
    <div class="container wrap">
        <pc:bet_table />
    </div>
    <ui:footer />
</in:html>
