<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="tote.entity.Category"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="ui"%>
<%@taglib tagdir="/WEB-INF/tags/navbars" prefix="nb"%>
<%@taglib tagdir="/WEB-INF/tags/includes" prefix="in"%>

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<in:include-admin />
<body>
    <nb:navbar-admin />
    <div class="container">
        <h3>Добавление исхода</h3>
        <div class="form-group form-add">
            <form id="sbm-frm" action="add-out.html" method="POST">
                <label class="col-form-label">Выберите дисциплину</label>
                <select class="form-control" name="discipline" id="discipline">
                    <c:forEach items="${categories}" var="dis" >
                           <option value="${dis.id}">${dis.name}</option>
                    </c:forEach>
                </select>
                <label class="col-form-label">Выберите событие</label>
                <select class="form-control" name="event" id="event"></select>
                <label class="col-form-label">Введите название исхода</label>
                <input class="form-control" type="text" id="outcome" name="outcome" placeholder="Исход" required>
                <label class="col-form-label">Введите коэффициент</label>
                <input class="form-control" type="number" name="coeff" min="1.01" step="0.01" value="1.01" placeholder="Коэффициент" required>
                <button type="button" class="btn btn-primary submit-btn" onclick="info(3)">Добавить</button>
            </form>
        </div>
    </div>
    <ui:footer />
</body>
<script type="text/javascript">
    var categories = [
      <c:forEach items="${categories}" var="cat" varStatus="status">
      {
         id: ${cat.id},
         name: '${cat.name}',
         events : [
             <c:forEach items="${cat.events}" var="event" varStatus="status2">
             {
                 id: ${event.id},
                 name: '${event.name}'
             }
             <c:if test="${not status2.last}">,</c:if>
             </c:forEach>
         ]
      }
      <c:if test="${not status.last}">,</c:if>
      </c:forEach>
    ];

    $(document).ready(function(){
        $("#discipline").change(function(){
            var self = this.value;
            categories.forEach(function(category){
                if (category.id == self){
                    $("#event").empty();
                    category.events.forEach(function(evn){
                        $("#event").append('<option value="' + evn.id + '">' + evn.name + '</option>');
                    });
                }
            });
        });

        $('#discipline').change();
    });

</script>
</html>
