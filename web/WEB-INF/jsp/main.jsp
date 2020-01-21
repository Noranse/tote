<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="ui"%>
<%@taglib tagdir="/WEB-INF/tags/navbars" prefix="nb"%>
<%@taglib tagdir="/WEB-INF/tags/includes" prefix="in"%>

<!DOCTYPE html>
<html>
<in:include />
<body onload="startTime(); getDate();">
    <nb:navbar-main />

    <div id="datetime">
        <p id="date">
            <b></b>
        </p>
        <p id="timer">
            <b></b>
        </p>
    </div>

    <div class="container wrap">
        <div id="demo" class="carousel slide" data-ride="carousel">
            <ul class="carousel-indicators">
                <li data-target="#demo" data-slide-to="0" class="active"></li>
                <li data-target="#demo" data-slide-to="1"></li>
                <li data-target="#demo" data-slide-to="2"></li>
            </ul>
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="images/football.jpg">
                </div>
                <div class="carousel-item">
                    <img src="images/basketball.jpg">
                </div>
                <div class="carousel-item">
                    <img src="images/hockey.jpg">
                </div>
            </div>
            <a class="carousel-control-prev" href="#demo" data-slide="prev"> <span class="carousel-control-prev-icon"></span>
            </a> <a class="carousel-control-next" href="#demo" data-slide="next"> <span class="carousel-control-next-icon"></span>
            </a>
        </div>

        <div class="list-group list-disciplines" style="overflow: hidden;">
            <c:forEach items="${categories}" var="dis">
                <a href="bets.html" class="list-group-item list-group-item-action list-group-item-success categories-main">${dis.name}</a>
            </c:forEach>
        </div>
    </div>

    <ui:footer />
</body>
</html>