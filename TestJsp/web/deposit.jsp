<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        window.onload = function(){
            document.getElementById("back").onclick = function(){
            window.history.back();
        }
        }
    </script>

</head>
<body>

<%
String username = request.getParameter("aname");
%>

尊敬的<%=username%>用户存款成功
<input type="button" id="back" value="返回\">
</body>
</html>




