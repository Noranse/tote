<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="ui"%>
<%@taglib tagdir="/WEB-INF/tags/navbars" prefix="nb"%>
<%@taglib tagdir="/WEB-INF/tags/includes" prefix="in"%>

<!DOCTYPE html>
<html>
<in:include-error />
<body>
    <nb:navbar-error />
    <div class="container wrap">
        <div class="img-error">
            <img src="/tote/images/403-error.png">
        </div>
        <h1>Доступ к данной странице вам недоступен</h1>
    </div>
    <ui:footer />
</body>
</html>