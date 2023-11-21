<%@ page import="java.io.InputStream" %>
<%@ page import="java.io.InputStreamReader" %>
<%@ page import="java.util.Properties" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <%

    String lang = request.getHeader("Accept-language");

    System.out.println(lang);

    String langs = lang.split(",")[0].split(";")[0];
    System.out.println(langs);



    // 通过线程读取文件
    String filename;
    if (langs.equals("zh-CN")) {
      filename = "ch.properties";
    } else {
      filename = "en.properties";
    }
    InputStream inp = Thread.currentThread().getContextClassLoader().getResourceAsStream(filename);
    InputStreamReader inputStreamReader = new InputStreamReader(inp);

    Properties properties = new Properties();
    properties.load(inputStreamReader);

    String user = properties.getProperty("username");
    String sex = properties.getProperty("sex");
    String login = properties.getProperty("login");
  %>

  <form action="regist" method="post">
    <%=user%>： <input type="text" name="username" value=""><br>
    <%=sex%>： <input type="text" name="sex" value=""><br>

    爱好：<br>
    <input type="checkbox" name="hobby" value="抽烟">抽烟<br>
    <input type="checkbox" name="hobby" value="喝酒">喝酒<br>
    <input type="checkbox" name="hobby" value="烫头">烫头<br>

    <input type="submit" value="<%=login%>">

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
