<%@ page import="java.util.ArrayList" %>
<%@ page import="domain.ProductClass" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>product</title>

    <script>
        window.onload = function () {
            var elementById = document.getElementsByClassName("btn");
            console.log("button", elementById)
            for (var i = 0; i < elementById.length; i++) {
                console.log(elementById[i]);
                elementById[i].onclick = function () {
                    document.getElementById("flage").value = this.value;
                    document.getElementById("form").submit();
                }
            }
        }
    </script>
</head>
<body>

    <h1 style="text-align: center;">请选购商品，傻叼</h1>

    <form action="saveProduct" method="post" id="form">
        <input type="text" hidden="hidden" name="flag" value="" id="flage">
        <table border="1" width="60%" align="center">
            <tr>
                <td></td>
                <td>商品名称</td>
                <td>商品单价</td>
            </tr>

            <%
                ArrayList<ProductClass> productArr = (ArrayList<ProductClass>)request.getAttribute("productArr");

                for (ProductClass item : productArr) {
                    out.println("<tr>");
                    out.println("<td><input type=\"checkbox\" name=\"pid\" value=\""+item.getPid()+"\"></td>");
                    out.println("<td>"+item.getPname()+"</td>");
                    out.println("<td>"+item.getPrice()+"</td>");
                    out.println("</tr>");
                }
            %>

            <tr>
                <td colspan="3" align="center">
                    <%--将选中的商品存储起来、然后选择其他的商品--%>
                    <input type="button" class="btn" name="" value="继续购物">
                    ｜｜
                    <%--将选中的商品存储起来、然后结算商品--%>
                    <input type="button" class="btn" name="" value="结算清单">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
