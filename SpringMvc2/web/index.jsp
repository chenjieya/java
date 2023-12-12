<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  ${requestScope.result}
    <form action="login.do" method="post">
      <input name="username"><br>
      <input name="password"><br>

      <input value="submit" type="submit">
    </form>


  <hr>
  <a href="excetion.do">异常测试</a>
  </body>
</html>
