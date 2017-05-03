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
<style type="text/css">
    body {
        text-align: center;
    }
</style>
<body bgcolor="#FAEBD7">
<h1>创建客户界面</h1>

<form action="customer_create" method="post">
    <style>
        p {
            height: 20px;
            line-height: 20px;
        }

        form {
            width: 500px;
            display: inline-block;
            border: 1px solid #ccc;
        }

        input {
            background-color: lightsteelblue
        }
    </style>
    <div style="width:100px; float:left ">
        <p>姓名：*</p>

        <p>电话：*</p>

        <p>联系人：*</p>

        <p>电子邮箱：*</p>

        <p>备注：*</p>
    </div>
    <div style="width:150px; float:left;">
        <p><input name="name" maxlength="20"/></p>

        <p><input name="telephone" maxlength="20"/></p>

        <p><input name="contact" maxlength="20"/></p>

        <p><input name="email" maxlength="50"/></p>

        <p><input name="remark" maxlength="100"/></p>

        <p><input type="submit" value="提交"></p>
    </div>


</form>
</body>
</html>