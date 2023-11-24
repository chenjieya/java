<%@ page import="java.util.ArrayList" %>
<%@ page import="domain.CategoryClass" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>category</title>

    <script>
        window.onload = function() {
            document.getElementById("categoryDom").onchange = function () {
                location.href = "product?cid="+this.value;
            }
        }
    </script>
</head>
<body>
<h1>欢迎来到商品种类页面</h1>
<h2>请从下面种类中任意选择，不选拉到</h2>

<select name="cid" id="categoryDom">
    <option value="">请选择</option>

    <c:forEach var="categoryClass" items="${requestScope.categoryArr}">
        <option value="${categoryClass.getCid()}">${categoryClass.getCname()}</option>
    </c:forEach>
</select>
</body>
</html>
