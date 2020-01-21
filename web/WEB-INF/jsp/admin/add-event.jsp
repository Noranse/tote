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
        <h3>Добавление события</h3>
        <div class="form-group form-add">
            <form id="sbm-frm" action="add-eve.html" method="POST">
                <label class="col-form-label">Выберите дисциплину</label> 
                <select class="form-control" name="discipline">
                        <c:forEach items="${categories}" var="dis">
                            <option value="${dis.id}" >${dis.name}</option>
                        </c:forEach>
                </select> <label class="col-form-label">Введите название события</label> <input class="form-control" type="text" id="event" name="event" placeholder="Событие" required> 
                <label class="col-form-label">Введите дату события</label> <input class="form-control"
                    type="datetime-local" id="date" name="date" placeholder="Дата события" required>
                <button type="button" class="btn btn-primary submit-btn" onclick="info(2)">Добавить</button>
            </form>
        </div>
    </div>
    <ui:footer />
</body>
</html>