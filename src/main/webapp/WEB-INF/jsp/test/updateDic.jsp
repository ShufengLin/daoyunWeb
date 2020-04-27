<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>修改字典</title>
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
                    <small>修改字典</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="" name="userForm">
        <input type="hidden" name="dicId" value="${dic.dicId}"/>
        字典名称：<input type="text" name="dicName" value="${dic.dicName}"/>
        字典Code：<input type="text" name="dicCode" value="${dic.dicCode}"/>
        字典详情：<input type="text" name="dicDescription" value="${dic.dicDescription }"/>
        <input type="button" value="提交" onclick="updateDic()"/>
    </form>
    <script type="text/javascript">
        function updateDic() {
            var form = document.forms[0];
            form.action = "<%=basePath %>testExample1/updateDic";
            form.method = "post";
            form.submit();
        }
    </script>
</div>