<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

    <div class="container">

    <div class="label_for_user">
        <h2>Добро пожаловать в личный кабинет ${username}</h2>
    </div>
        <div class="form-group">
            <label class="label_for_bill" for="bill"> Ваш баланс </label>
        <div class="input-group mb-3">
            <div class="input-group-append">
                <span class="input-group-text">руб</span>
            </div>
                <input type="text" class="form-control" id="bill" value="${balance}" readonly>
             <div class="input-group-append">
              
                <a type="button" class="input-group-text" href="betUp.html">Пополнить счёт</a>
            </div>
        </div>
        </div>
      
      
        <div class="label_for_bet_table">
            <h2>Сделанные ставки</h2>
        </div>
        <table class="table">
             <thead class="thead-dark">
                <tr>
                    <th scope="col">№</th>
                    <th scope="col">Дисциплина</th>
                    <th scope="col">Событие</th>
                    <th scope="col">Исход</th>
                    <th scope="col">Сумма</th>
                    <th scope="col">Коэффициент</th>
                    <th scope="col">Выигрыш</th>
                </tr>
            </thead>
            <tbody>
                <c:set var="betNum" value="0" />
                <c:forEach items="${betsAll}" var="bet">
                    <tr>
                        <th scope="row">${betNum = betNum+1}</th>
                        <td>${bet.catName}</td>
                        <td>${bet.eventName}</td>
                        <td>${bet.outcomeName}</td>
                        <td>${bet.betValue}</td>
                        <c:choose>
                        <c:when test="${bet.state == 0}">
                        <td><strong>${bet.resCoef}</strong></td>
                        <td>Еще в игре</td>
                        </c:when>
                        <c:otherwise>
                        <c:choose>
                        <c:when test="${bet.state == 1}">
                         <td style="color:green;"><strong>${bet.resCoef}</strong></td>
                        </c:when>
                        <c:when test="${bet.state == -1}">
                         <td style="color:red;"><strong>${bet.resCoef}</strong></td>
                        </c:when>
                        </c:choose>
                        <td>${bet.winSum}</td>
                        </c:otherwise>
                        </c:choose>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
