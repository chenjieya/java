<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
String username = request.getParameter("aname");
Float money = (Float) request.getAttribute("money");
%>

尊敬的<%=username%>用户，你的账号余额为 <%=money%>
</body>
</html>
