<%--
  Created by IntelliJ IDEA.
  User: limo
  Date: 2017/2/27
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
  <title>login</title>
</head>
<body>

<a href="<%=path%>/user">user</a><br>
<a href="<%=path%>/department">department</a>


</body>
</html>
