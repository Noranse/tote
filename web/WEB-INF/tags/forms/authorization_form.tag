<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <div class="bs-docs-section">
        <div class="alert alert-dismissible alert-secondary">
            <button class="close" type="button" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <strong>Новый пользователь?</strong> <a class="alert-link" href="registration.html">Зарегистрируйтесь</a>.
        </div>

        <div>
           ${SPRING_SECURITY_LAST_EXCEPTION.message}
        </div>

        <form action="j_spring_security_check.html" method="post">
            <div class="form-group">
                <h1>Авторизация</h1>
                <label for="login">Введите логин</label> 
                <input type="text" class="form-control"
                    name="username" id="login" placeholder="логин"> <small id="login">Для
                    входа пожалуйста введите логин.</small>
            </div>
            <div class="form-group">
                <label for="password">Введите пароль</label> <input type="password"
                    class="form-control" name="password" id="password" placeholder="пароль">
            </div>
            <button type="submit" class="btn btn-primary">Войти</button>
        </form>
    </div>