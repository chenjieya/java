<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
        String user = request.getParameter("username");
    %>

    <div>****************************</div>
    <div>欢迎尊贵的<%=user%>用户登陆我行系统</div>
    <div>****************************</div>

    <div><a href="searchMoney?aname=<%=user%>">查询余额</a></div>
    <div><a href="depositTemplate.jsp?aname=<%=user%>">存款</a></div>
</body>
</html>





