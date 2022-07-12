<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container">
        <a class="navbar-brand" href="main.html"><img src="images/logo.jpg"></a>
        <ul class="nav navbar-nav ml-auto">
            <li class="nav-item"><a class="nav-link" href="bets.html">Список исходов</a></li>
        </ul>
        <ul class="nav navbar-nav ml-auto">
           
            <c:set var="name" value="${username}" />
            <c:choose>
                <c:when test="${name == 'admin'}">
                    <li class="nav-item"><a class="nav-link" href="admin/admin.html">${username} </a></li>
                    <li class="nav-item"><a class="nav-link" href="logout.html">Выход </a></li>
                </c:when>
                <c:when test="${name == null}">
                   <li class="nav-item"><a class="nav-link" href="login.html">Войти</a></li>
                   <li class="nav-item"><a class="nav-link" href="registration.html">Регистрация</a></li>
                </c:when>
                <c:otherwise>
                   <li class="nav-item"><a class="nav-link" href="feedback.html">Нужна помощь?</a></li>
                    <li class="nav-item"><a class="nav-link" href="private_cabinet.html">${username} </a></li>
                     <li class="nav-item"><a class="nav-link" href="logout.html">Выход </a></li>
                </c:otherwise>
            </c:choose>
        </ul>
    </div>
</nav>