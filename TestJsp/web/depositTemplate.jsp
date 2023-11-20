<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    String username = request.getParameter("aname");
%>

<form action="submitSave" method="post">
    <div>尊敬的用户，请输入存款金额：<input type="text" name="money" value=""></div>
    <input type="text" name="aname" value="<%=username%>" hidden>
    <input type="submit" name="提交" id="submit">
</form>
</body>
</html>



