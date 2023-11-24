<%@ page import="domain.UserClass" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>showEl</title>
</head>
<body>
    <%--传递参数--%>
    ${param.requestParam} <br>
    ${paramValues.hobby}<br>

    <br>



    <%--jsp正常写法--%>
    <%
        String str = (String) request.getAttribute("str");
        if (str != null) {
            out.write(str);
        }
    %>
    <%--  el表达式语言  --%>
    ${requestScope.str}

    <%--jsp正常写法--%>
    <%
        UserClass userobj = (UserClass)request.getAttribute("userObj");
        // out.write(userobj);  浏览器不认识
        out.write(userobj.getUsername());
        out.write("<br>");
        out.write(userobj.getPassword());
    %>
    <%--  el表达式语言  --%>
    ${requestScope.userObj}<br>
    ${requestScope.userObj.username}<br>
    ${requestScope.userObj.password}<br>
    ${requestScope.userObj.getUsername()}<br>
    ${requestScope.userObj.getPassword()}<br>




    <hr>
    ${sessionScope.arrInt} <br>
    ${sessionScope.arrInt[0]} <br>
    ${sessionScope.arrInt[1]} <br>
    <br>
    ${sessionScope.arrObj[0].username}-${sessionScope.arrObj[0].password} <br>
    <br>
    ${sessionScope.arrTwo[0][0]}-${sessionScope.arrTwo[0][1]}<br>


</body>
</html>
