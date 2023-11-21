<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>welcome</title>
</head>
<body>

<%
//    int code = response.getStatus();  // 获取状态吗
//    System.out.println(code);  // 200
//
//    response.setStatus(500); // 设置状态吗
//    System.out.println(response.getStatus());  // 500

    String user = request.getParameter("username");
    String pwd = request.getParameter("password");

%>

<h1>我是welcome.jsp</h1>
<div>user: <%=user%></div>
<div>pwd: <%=pwd%></div>
</body>
</html>
