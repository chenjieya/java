<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>

    <script>
      window.onload = function() {
        document.getElementById("register").onclick = function () {
          window.location.href = "selectCountry.jsp";
        }
      }
    </script>

  </head>
  <body>
    <form action="login" method="post">
      账号: <input type="text" name="username"> <br>
      密码: <input type="password" name="password"> <br>
      <input type="submit" value="登陆">
      <input type="button" id="register" value="注册">
    </form>
  </body>
</html>
