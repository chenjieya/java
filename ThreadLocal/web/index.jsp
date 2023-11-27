<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  ${requestScope.result}
    <form action="login" method="post">
      账号: <input name="username"> <br>
      密码: <input type="password" name="password"><br>
      <input type="submit" name="登录">
    </form>
  </body>
</html>
