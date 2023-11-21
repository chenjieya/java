<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>welcome</title>
</head>
<body>

<%
    int code = response.getStatus();  // 获取状态吗
    System.out.println(code);  // 200

    response.setStatus(500); // 设置状态吗
    System.out.println(response.getStatus());  // 500

%>

<h1>welcome</h1>
</body>
</html>
