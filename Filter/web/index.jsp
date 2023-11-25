<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>

    ${requestScope.result}
    <form action="login" method="post">
       账号： <input type="text" name="username" placeholder="username"> <br>
       密码： <input type="password" name="password" placeholder="password"> <br>
       <input type="submit" value="登录">
    </form>
</body>
</html>
