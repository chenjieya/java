<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String requestVal = (String)request.getAttribute("val");
        String sessionVal = (String) session.getAttribute("val");
        String applicationVal = (String) application.getAttribute("val");
    %>
展示成果：
<br>
<h2>request.setAttribute:<%=requestVal%></h2>
<h2>session.setAttribute:<%=sessionVal%></h2>
    <h2>application.setAttribute:<%=applicationVal%></h2>
</body>
</html>
