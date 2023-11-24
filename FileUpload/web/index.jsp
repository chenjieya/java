<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form action="testFile" method="post" enctype="multipart/form-data">
      账户： <input type="text" name="username">  <br>
      文件：<input type="file" name="file"> <br>

      <input type="submit" value="提交">
    </form>

    <a href="download?filename=可道云使用方法.md">下载文件</a>
  </body>
</html>
