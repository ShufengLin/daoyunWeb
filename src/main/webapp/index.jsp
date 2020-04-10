<%--
  Created by IntelliJ IDEA.
  User: wt103
  Date: 2020/2/29
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%pageContext.setAttribute("path", request.getContextPath());%>
<html>
<head>
    <title>首页</title>
</head>
<body>
<h3>
    <a href="${path }/testExample/test">测试页面</a>
</h3>
<h3>
    <a href="${path }/testExample1/test1">字典测试页面</a>
</h3>
<h3>
    <a href="${path }/testExample2/test2">字典明细测试页面</a>
</h3>
</body>
</html>
