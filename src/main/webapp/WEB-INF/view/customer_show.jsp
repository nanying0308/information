<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: llw
  Date: 2017/4/4
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="BASE" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>客户管理</title>
</head>
<body>
<h1>客户列表</h1>
<table>
    <tr>
        <th>序号</th>
        <th>客户名称</th>
        <th>联系人</th>
        <th>电话号码</th>
        <th>邮箱地址</th>
        <th>备注</th>
        <th>操作</th>
    </tr>
    <c:forEach var="customer" items="${customerList}">
        <tr>
            <td>${customer.id}</td>
            <td>${customer.name}</td>
            <td>${customer.contact}</td>
            <td>${customer.telephone}</td>
            <td>${customer.email}</td>
            <td>${customer.remark}</td>
            <td>
                <a href="${BASE}/customer_edit?id=${customer.id}">编辑</a>
                <a href="${BASE}/customer_delete?id=${customer.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>

</html>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/3/30
  Time: 17:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page pageEncoding="UTF-8" %>
<html>
<head>
    <title>客户管理 - 创建客户</title>
</head>
<body>
<h1>创建客户界面</h1>
<form action="customer_create" method="post">
    id<input name="id"><br>
    name<input name="name"><br>
    telephone<input name="telephone"><br>
    contact<input name="contact"><br>
    email<input name="email"><br>
    remark<input name="remark"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>