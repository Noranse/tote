<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags/forms" prefix="fr"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="ui"%>
<%@taglib tagdir="/WEB-INF/tags/navbars" prefix="nb"%>
<%@taglib tagdir="/WEB-INF/tags/includes" prefix="in"%>
<!DOCTYPE html>
<html>
<in:include2/>
<body>
    <nb:navbar-main />
    <div class="container wrap">
        <fr:feedback_form />
    </div>
    <ui:footer />
</body>
</html>
