<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="ui"%>
<%@taglib tagdir="/WEB-INF/tags/navbars" prefix="nb"%>
<%@taglib tagdir="/WEB-INF/tags/includes" prefix="in"%>

<!DOCTYPE html>
<html>
<in:include />
<body>
    <nb:navbar-main />
    <div class="container wrap">
        <h1>Список исходов</h1>
        <form id="bets-form" class="outcomes" onsubmit="return isCheck()">
            <div class="row">
                <div class="col-md-10">
                    <table class="table">
                        <thead class="thead-dark">
                            <tr>
                                <th scope="col">№</th>
                                <th scope="col">Дата</th>
                                <th scope="col">Событие</th>
                                <th>Исход</th>
                                <th scope="col">КФ</th>
                            </tr>
                        </thead>
                        <tbody>
                        
                        <c:set var="betNum" value="0" />
                            <c:forEach items="${events}" var="event">
                                <c:forEach items="${event.results}" var="bet">
                                    <c:choose>
                                        <c:when test="${bet.state==0}">
                                            <tr>
                                                <th scope="row">${betNum = betNum+1}</th>
                                                <td>${event.date}</td>
                                                <td>${event.name}</td>
                                                <td>${bet.name}</td>
                                                <td>
                                                    <div class="custom-control custom-checkbox">
                                                        <input type="checkbox" id="${bet.id}-l" class="custom-control-input" name="coeff[]" value="${bet.id}"> <label class="custom-control-label" for="${bet.id}-l">${bet.coef}</label>
                                                    </div>
                                                </td>
                                            </tr>
                                        </c:when>
                                    </c:choose>
                                </c:forEach>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
                <div class="col-md-2 bet-submit">
                    <div class="bet-form">
                        <label class="col-form-label">Сумма ставки</label> <input class="form-control" type="number" name="bet" min="0.2" max="1000" step="0.01" value="0.2" placeholder="Ставка">
                    </div>
                    <button type="submit" class="btn btn-primary submit-btn">Сделать ставку</button>
                </div>
            </div>
        </form>

    </div>
    <ui:footer />
</body>
</html>