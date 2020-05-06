<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/4/6
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<% String appPath = request.getContextPath(); %>
<html>
<head>
    <title>Dicd列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    基于SSM框架的管理系统：简单实现增、删、改、查。
                </h1>
            </div>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>字典明细列表</small>
                </h1>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="<%=appPath%>/DictionaryDetail/toAddDicd">新增</a>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>编号</th>
                    <th>字典编号</th>
                    <th>字典ItemKey</th>
                    <th>字典ItemValue</th>
                    <th>字典Status</th>
                    <th>字典码</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="dicd" items="${requestScope.get('list')}" varStatus="status">
                    <tr>
                        <td>${dicd.id}</td>
                        <td>${dicd.dicId}</td>
                        <td>${dicd.itemKey}</td>
                        <td>${dicd.itemValue}</td>
                        <td>${dicd.isDefault}</td>
                        <td>${dicd.code}</td>
                        <td>
                            <a href="<%=appPath%>/DictionaryDetail/toUpdateDicd?id=${dicd.id}">更改</a> |
                            <a href="<%=appPath%>/DictionaryDetail/del/${dicd.id}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
