<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        request.setCharacterEncoding("utf-8");
        String testVal = request.getParameter("testVal");

        // request
        request.setAttribute("val", testVal);
        // session
        session.setAttribute("val", testVal);
    %>

    <a href="result.jsp">点我呀，数据存储完成了</a>
</body>
</html>