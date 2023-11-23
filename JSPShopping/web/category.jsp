<%@ page import="java.util.ArrayList" %>
<%@ page import="domain.CategoryClass" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>category</title>
</head>
<body>
<h1>欢迎来到商品种类页面</h1>
<h2>请从下面种类中任意选择，不选拉到</h2>

<select name="cid">
    <option value="">请选择</option>
    <%
      ArrayList<CategoryClass> categoryArr = (ArrayList<CategoryClass>)request.getAttribute("categoryArr");

      for (CategoryClass categoryClass : categoryArr) {
        out.println("<option value=\""+categoryClass.getCid()+"\">"+categoryClass.getCname()+"</option>");
      }
    %>
</select>
</body>
</html>
