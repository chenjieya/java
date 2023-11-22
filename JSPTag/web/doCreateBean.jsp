<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--<jsp:include page="include.html"></jsp:include>--%>

<jsp:useBean id="atm" class="domain.AtmClass" scope="request"></jsp:useBean>
<%--
    name: 需要赋值的对象
    property: 对象中的属性
    param: 属性的值是什么？是请求参数的key对应的value
--%>
<jsp:setProperty name="atm" property="aname" param="username"></jsp:setProperty>
<jsp:setProperty name="atm" property="apassword" param="password"></jsp:setProperty>
<jsp:setProperty name="atm" property="abalance" param="abalance"></jsp:setProperty>

<%--转发到控制层类--%>
<%--  转发传递过去的参数  --%>
<jsp:forward page="doRegister">
    <jsp:param name="testKey" value="testValue"></jsp:param>
    <jsp:param name="testKey2" value="testValue2"></jsp:param>
</jsp:forward>