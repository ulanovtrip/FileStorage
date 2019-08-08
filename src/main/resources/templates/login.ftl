<#ftl encoding='UTF-8'>

<html>
<head>
    <link href="/css/styles.css" rel="stylesheet">
    <link href="/css/bootstrap.min.css" rel="stylesheet"/>
</head>

<body>

<#if error??>
<div class="alert alert-danger" role="alert" style="text-align: center">Логин или пароль введены неверно</div>
</#if>

<div class="form-style-2" style="text-align: center">
    <div class="form-style-2-heading">
        Введите логин и пароль
    </div>
    <form method="post" action="/login">
        <label for="login">Логин
            <input class="input-field" type="text" id="login" name="login">
        </label>
        <br>
        <label for="password">Пароль
            <input class="input-field" type="password" id="password" name="password">
        </label>
        <br>
        <label for="remember-me">
            <input type="checkbox" id="remember-me" name="remember-me">Запомнить меня</label>
        <input type="submit" value="Login">
    </form>
</div>
</body>
</html>
