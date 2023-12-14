<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="importCars" method="post" enctype="multipart/form-data">
        <input type="file" name="file"> <br>
        <input type="submit" value="导入"> <br>
    </form>

    <a href="cardList">展示所有汽车信息</a>
</body>
</html>
