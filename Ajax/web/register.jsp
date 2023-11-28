<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>

    <script>
      window.onload = function () {
        document.getElementById("country").onchange = function () {
          var xmlHttp = new XMLHttpRequest();
          xmlHttp.open("post", "area?cid="+this.value+"");
          xmlHttp.send();

          xmlHttp.onreadystatechange = function () {

            if (this.readyState === 4 && this.status === 200) {

              var obj = JSON.parse(this.responseText);
              console.log(obj);

            }

          }

        }
      }
    </script>
</head>
<body>
  <form action="regiter" method="post">
    <input type="text" name="username" placeholder="账号"> <br>
    <input type="password" name="password" placeholder="密码"> <br>
    <select name="country" id="country">
      <option value="">==请选择国家==</option>
      <c:forEach var="item" items="${requestScope.country}">
        <option value="${item.getCid()}">${item.getCname()}</option>
      </c:forEach>
    </select>
    <select name="area">
      <option value="">==请选择地区==</option>
    </select>
    <select name="city">
      <option value="">==请选择城市==</option>
    </select>

    <br>

    <input type="submit" value="注册"> <br>
  </form>
</body>
</html>
