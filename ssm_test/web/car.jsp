<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.bootcdn.net/ajax/libs/twitter-bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">

    <!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
    <link rel="stylesheet" href="https://cdn.bootcdn.net/ajax/libs/twitter-bootstrap/3.4.1/css/bootstrap-theme.min.css" integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ" crossorigin="anonymous">

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.bootcdn.net/ajax/libs/twitter-bootstrap/3.4.1/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>
</head>
<body>
    <h1 align="center">欢迎来到汽车页面</h1>
    <table class="table-bordered table-responsive">
        <tr>
            <th>汽车id</th>
            <th>汽车名称</th>
            <th>汽车颜色</th>
            <th>汽车价格</th>
            <th>操作</th>
        </tr>
        <c:choose>
            <c:when test="${requestScope.cars == null || requestScope.cars.size() == 0}">
                <tr>
                    <td colspan="5">暂无数据</td>
                </tr>
            </c:when>
            <c:otherwise>
                <c:forEach items="${requestScope.cars}" var="car">
                    <tr>
                        <td>${car.cno}</td>
                        <td>${car.cname}</td>
                        <td>${car.color}</td>
                        <td>${car.price}</td>
                        <td>
                            编辑｜删除
                        </td>
                    </tr>
                </c:forEach>
            </c:otherwise>
        </c:choose>
    </table>
</body>
</html>
