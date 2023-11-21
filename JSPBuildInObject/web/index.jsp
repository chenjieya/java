<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <form action="regist" method="post">
    姓名： <input type="text" name="username" value=""><br>
    性别： <input type="text" name="sex" value=""><br>

    爱好：<br>
    <input type="checkbox" name="hobby" value="抽烟">抽烟<br>
    <input type="checkbox" name="hobby" value="喝酒">喝酒<br>
    <input type="checkbox" name="hobby" value="烫头">烫头<br>

    <input type="submit" value="提交">

  </form>

  <%
    StringBuffer url = request.getRequestURL();
    String uri = request.getRequestURI();
    out.println(uri);
    out.println("<br/>");
    out.println(url);
  %>

  </body>
</html>
