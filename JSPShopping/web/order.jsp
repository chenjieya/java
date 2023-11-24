<%@ page import="domain.ProductClass" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>order</title>
</head>
<body>

    <h1 style="text-align: center">订单</h1>

    <table border="1" width="40%" align="center">
        <tr>
            <td>商品名称</td>
            <td>商品单价</td>
        </tr>

        <c:forEach var="item" items="${sessionScope.selectedProduct}">
            <tr>
                <td>${item.getPname()}</td>
                <td>${item.getPrice()}</td>
            </tr>
        </c:forEach>

<%--        <%--%>
<%--            ArrayList<ProductClass> selectedProduct = (ArrayList<ProductClass>)session.getAttribute("selectedProduct");--%>
<%--            for (ProductClass item : selectedProduct) {--%>
<%--                out.println("<tr>");--%>
<%--                out.println("<td>"+item.getPname()+"</td>");--%>
<%--                out.println("<td>"+item.getPrice()+"</td>");--%>
<%--                out.println("</tr>");--%>
<%--            }--%>
<%--        %>--%>

        <tr>
            <td colspan="2">
                计算总价：${requestScope.totalPrice}
            </td>
        </tr>

    </table>



</body>
</html>
