<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script>
      window.onload = function () {

      }
    </script>
</head>
<body>
  <form action="regiter" method="post">
    <input type="text" name="username" placeholder="账号"> <br>
    <input type="password" name="password" placeholder="密码"> <br>
    <select name="country">
      <option value="">==请选择国家==</option>

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
