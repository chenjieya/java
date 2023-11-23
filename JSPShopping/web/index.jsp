<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>

    <script>
      window.onload = function () {
        document.getElementById("register").onclick = function () {
          window.location.href = "register.jsp";
        }
      }
    </script>
  </head>
  <body>
    <%
      String register = (String)request.getAttribute("register");
      if (register!=null) {
        out.println(register);
        out.println("<br>");
      }
    %>

    <%
      String login = (String) request.getAttribute("login");
      if (login!=null) {
        out.println(login);
        out.println("<br>");
      }
    %>

    <form action="login" method="post">
      账号： <input type="text" name="username" value=""> <br>
      密码： <input type="password" name="password" value=""> <br>
      <input type="submit" value="登录">
      <input type="button" value="注册" id="register">
    </form>
  </body>
</html>
