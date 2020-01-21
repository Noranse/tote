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
    <h1>Список исходов</h1>
        <div class="row">
            <table class="table">
                <thead class="thead-dark">
                    <tr>
                        <th scope="col">№</th>
                        <th scope="col">Дата</th>
                        <th scope="col">Событие</th>
                        <th scope="col">Исход</th>
                        <th scope="col">КФ</th>
                        <th scope="col">Состояние</th>
                    </tr>
                </thead>
                <tbody>
                
                <c:set var="betNum" value="0" />
                 <c:forEach items="${events}" var="event">
                 
                  <c:forEach items="${event.results}" var="bet">
                 
                    <tr>
                        <th scope="row">${betNum = betNum+1}</th>
                        <td>${event.date}</td>
                        <td>${event.name}</td>
                        <td>${bet.name}</td>
                        <td>${bet.coef}</td>
                        <td>
                        <c:set var="betState" value="${bet.state}" />
                        <c:choose>
                        <c:when test="${betState == 0}">
                        <form id="bets-form" class="outcomes" action="state-outcomes.html" method="post">
                        <div>
                        <input type="hidden" name="betId" value="${bet.id}">
                            <div class="custom-control custom-radio">
                                <input type="radio" id="${bet.id}-1" name="state" class="custom-control-input" value="0" checked>
                                <label class="custom-control-label" for="${bet.id}-1">Еще не завершено</label>
                            </div>
                            <div class="custom-control custom-radio">
                                <input type="radio" id="${bet.id}-2" name="state" class="custom-control-input" value="1">
                                <label class="custom-control-label" for="${bet.id}-2">Прошла</label>
                            </div>
                            <div class="custom-control custom-radio">
                                <input type="radio" id="${bet.id}-3" name="state" class="custom-control-input" value="-1"> 
                                <label class="custom-control-label" for="${bet.id}-3">Не прошла</label>
                            </div>
                        </div>
                            <div>
                                <button type="submit" class="btn btn-primary submit-btn">Подтвердить</button>
                            </div>
                        </form>
                        </c:when>
                        <c:otherwise>
                        <c:choose>
                        <c:when test="${betState == 1}">
                        <span>Ставка прошла</span>
                        </c:when>
                        <c:when test="${betState == -1}">
                        <span>Ставка НЕ прошла</span>
                        </c:when>
                        </c:choose>
                        </c:otherwise>
                        </c:choose>
                        </td>
                    </tr>
                   
                    </c:forEach>
                   </c:forEach>
                
                </tbody>
            </table>
            </div>
    </div>
    <ui:footer />
</body>
</html>