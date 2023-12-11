<%--
  Created by IntelliJ IDEA.
  User: alvis
  Date: 2023/12/10
  Time: 20:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<%--  <a href="testController.do">测试一下</a>--%>
<%--  <a href="test.do?uname=cj&age=19">测试一下</a>--%>


  <a href="testParams.do?user=alvis&age=18&sex=男">测试一下普通参数的接收</a>

<%--  <form action="testParams.do" method="post">--%>
<%--    user: <input name="username"> <br>--%>
<%--    sex: <input name="sex"> <br>--%>
<%--    age: <input name="age"> <br>--%>
<%--    &lt;%&ndash;对象的属性也是对象&ndash;%&gt;--%>
<%--    wallet-color: <input name="wallet[0].color"> <br>--%>
<%--    wallet-price: <input name="wallet[0].price"> <br>--%>

<%--    wallet-color2: <input name="wallet[1].color"> <br>--%>
<%--    wallet-price2: <input name="wallet[1].price"> <br>--%>

<%--    <input type="submit" value="submit">--%>
<%--  </form>--%>

<form action="testParams.do" method="post">
  user: <input name="username"> <br>
  sex: <input name="sex"> <br>
  age: <input name="age"> <br>
  birthday: <input name="birthday"> <br>

  <input type="submit" value="submit">
</form>

  </body>
</html>
