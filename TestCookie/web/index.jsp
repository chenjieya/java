<%@ page import="java.net.CookieHandler" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <%
      Cookie cookie = new Cookie("testCookie", "cookieValue");
      response.addCookie(cookie);
    %>
    <a href="test?param=paramvalue">点我啊</a>
  </body>
</html>
