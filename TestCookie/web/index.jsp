<%@ page import="java.net.CookieHandler" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <%
      Cookie cookie = new Cookie("testCookie", "cookieValue");
      Cookie cookie2 = new Cookie("testCookie2", "cookie2");
      cookie.setMaxAge(3600*24);  // cookie存储一天
      response.addCookie(cookie);
      response.addCookie(cookie2);
    %>
    <a href="test?param=paramvalue">点我啊</a>
  </body>
</html>
