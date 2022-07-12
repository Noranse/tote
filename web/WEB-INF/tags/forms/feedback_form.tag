<%@ tag language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="ui"%>

<div class="bs-docs-section">
    <form method="POST" action="https://formspree.io/14plus@mail.ru">
        <p>
            <b>Введите ваш email:</b><br> <input type="email" required class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
        </p>
        <p>
            <b>Опишите вашу проблему:</b><Br>
            <textarea required class="form-control mr-sm-2" name="message" placeholder="" style="width: 420px; height: 350px;"></textarea>
        </p>
        <button type="submit" class="btn btn-primary">Отправить</button>
    </form>
</div>