<%@ tag language="java" pageEncoding="UTF-8"%>
    <div class="bs-docs-section">
    <div class="alert alert-dismissible alert-secondary">
            <button class="close" type="button" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <strong>Уже зарегистрированы?</strong> <a class="alert-link" href="login.html">Войти</a>.
        </div>
        <form action="registration.html" method="post">
            <div class="form-group">
            <h1>Регистрация</h1>
                <label for="login">Введите логин</label>
                 <input type="text"
                    class="form-control" id="login" name="username" placeholder="логин">
                <small id="login">Введите свое имя или псевдоним.</small>
            </div>
            <div class="form-group">
                <label for="password">Введите пароль</label>
                 <input type="password"
                    class="form-control" id="password" name="password" placeholder="пароль">
            </div>
            <button type="submit" class="btn btn-primary">Зарегистрироваться</button>
        </form>
    </div>