<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  ${requestScope.result}

  <%
    Cookie[] cookies = request.getCookies();
    // 说明cookie中存在账号和密码。无需用户操作，代码直接执行到登录那一步
    if (cookies != null && cookies.length >1) {
      request.getRequestDispatcher("login").forward(request, response);
    }
  %>

    <form action="login" method="post">
      账号： <input name="username"> <br>
      密码： <input type="password" name="password"> <br>
      <input type="checkbox" name="remember"> 七日内免登录 <br>
      <input type="submit" value="登录">
    </form>
  </body>
</html>
