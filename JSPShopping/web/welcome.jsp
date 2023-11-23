<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>welcome</title>
</head>
<body>
<%
  String username = request.getParameter("username");
%>
欢迎尊贵的<%=username%>用户，恭喜您成功进入了系统。<br>
没想到你能成功的登陆我的系统，所以我就没写后续的功能。<br>
&gt;&gt;<a href="category">点击此处带你进入备用系统。</a>&lt;&lt;
</body>
</html>
