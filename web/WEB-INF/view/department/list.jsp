<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/common/common.jsp"%>

<html>
<head>
    <title>部门列表</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>

<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/css/images/title_arrow.gif"/> 部门管理
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<div id="MainArea">
    <table cellspacing="0" cellpadding="0" class="TableStyle">

        <!-- 表头-->
        <thead>
        <tr align=center valign=middle id=TableTitle>
            <td width="150px">部门名称</td>
            <td width="200px">职能说明</td>
            <td>相关操作</td>
        </tr>
        </thead>
        <!--显示数据列表-->
        <tbody id="TableData" class="dataContainer" datakey="departmentList">

        <c:forEach items="${departmentList}" var="department">
            <tr>
                <th>${department.dname}</th>
                <th>${department.description}</th>
                <th><a href="/deleteDepartment/${department.did}">删除</a> <a href="#">修改</a></th>
            </tr>
        </c:forEach>

        </tbody>
    </table>

    <!-- 其他功能超链接 -->
    <div id="TableTail">
        <div id="TableTail_inside">
            <a href="/s"><img src="${pageContext.request.contextPath}/css/images/createNew.png" /></a>
        </div>
    </div>
</div>

</body>
</html>
