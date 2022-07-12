<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="ui"%>
<%@taglib tagdir="/WEB-INF/tags/navbars" prefix="nb"%>
<%@taglib tagdir="/WEB-INF/tags/includes" prefix="in"%>

<!DOCTYPE html>
<html>
<in:include-admin />
<body>
    <nb:navbar-admin />
    <div class="container wrap">
        <h3>Добавление дисциплины</h3>
        <div class="form-group form-add">
            <form id="sbm-frm" action="add-dis.html" method="POST">
                <label class="col-form-label">Введите название дисциплины</label> <input class="form-control" type="text" id="discipline" name="discipline" placeholder="Дисциплина" required>
                <button type="button" class="btn btn-primary submit-btn" onclick="info(1)">Добавить</button>
            </form>
        </div>
    </div>
    <ui:footer />
</body>
</html>