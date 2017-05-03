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
    <title>客户管理 - 编辑客户</title>
</head>
<style type="text/css">
    <%--
    body居中显示--%>
    body {
        text-align: center;

    }
</style>
<body bgcolor="#FAEBD7">
<h1>编辑客户界面</h1>

<form action="customer_edit" method="post">
    <style>
        p {
            height: 20px;
            line-height: 20px;
        }

        /*form表单整体居中显示
        */
        form {
            width: 500px;
            display: inline-block;
            border: 1px solid #ccc;
            /*background-color: #00bbee;*/
        }

        input {
            background-color: lightsteelblue;
        }
    </style>
    <div style="width:100px; float:left ">
        <p>ID：*</p>

        <p>姓名：*</p>

        <p>电话：*</p>

        <p>联系人：*</p>

        <p>电子邮箱：*</p>

        <p>备注：*</p>
    </div>
    <div style="width:150px; float:left;">
        <p><input name="id" readonly="true" value=${customer.id} /></p>

        <p><input name="name" value=${customer.name} size="20" /></p>

        <p><input name="telephone" value=${customer.telephone} size="15" /></p>

        <p><input name="contact" value=${customer.contact} maxlength="20" /></p>

        <p><input name="email" value=${customer.email} maxlength="50" /></p>

        <p><input name="remark" value=${customer.remark} maxlength="100" /></p>

        <p><input type="submit" value="确定保存" /></p>
    </div>


</form>
</body>
</html>