<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--导入核心标签--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--函数标签库--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%--格式化标签库--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:out value="testJSTL"></c:out>  <br>

    <c:if test="${requestScope.value > 1}">
        满足条件展示
    </c:if>
    <br>

    <c:choose>
        <c:when test="${requestScope.value == 1}">星期一</c:when>
        <c:when test="${requestScope.value == 2}">星期二</c:when>
        <c:when test="${requestScope.value == 3}">星期三</c:when>
        <c:when test="${requestScope.value == 4}">星期四</c:when>
        <c:when test="${requestScope.value == 5}">星期五</c:when>
        <c:when test="${requestScope.value == 6}">星期六</c:when>
        <c:when test="${requestScope.value == 7}">星期日</c:when>
        <c:otherwise>
            输入格式不正确，请输入1-7之间的数字
        </c:otherwise>
    </c:choose>
    <BR>


    <c:forEach varStatus="i" begin="1" end="10" step="1">
        ${i.index} <br>
    </c:forEach>

    <c:forEach var="UserClass" items="${requestScope.userList}">
        ${UserClass.username} --  ${UserClass.password}
    </c:forEach>


    <br>
    <hr>
    ${requestScope.strval} <br>
    ${fn:length(requestScope.strval)} <br>

    ${fn:contains(requestScope.strval, "c")}<br>

    ${fn:indexOf(requestScope.strval, "c")}<br>

    ${fn:replace(requestScope.strval, "c", "z")}<br>

    <br>
    <hr>
    <fmt:formatDate value="${requestScope.date}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate>


</body>
</html>
