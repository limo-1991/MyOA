<%--
  Created by IntelliJ IDEA.
  User: limo
  Date: 2017/2/27
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="ISO8859-1" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";


%>
<html lang="en">
<meta charset="utf-8" />
<head>
    <title>login</title>
</head>
<body>

<form:form commandName="user" action="userSave" method="post">
    <fieldset>
        <legend>Add a User</legend>
        <p>
            <label for="username">username</label>
            <form:input path="username" id="username"/>
        </p>
        <p>
            <label for="password">password</label>
            <form:input path="password" id="password"/>
        </p>
        <p>
            <label for="sex">sex</label>
            <form:input path="sex" id="sex"/>
        </p>
        <p>
            <label for="phone">phone</label>
            <form:input path="phone" id="phone"/>
        </p>
        <p>
            <label for="email">email</label>
            <form:input path="email" id="email"/>
        </p>
        <p id="buttons">
            <input id="submit" type="submit" value="Add User">
        </p>
    </fieldset>
</form:form>


<table>
    <tr>
        <th>name</th>
        <th>sex</th>
        <th>phone</th>
        <th>email</th>
        <th>delete</th>
    </tr>
    <c:forEach  items="${userList}" var="user">
        <tr>
            <td>${user.username}</td>
            <td>${user.sex}</td>
            <td>${user.phone}</td>
            <td>${user.email}</td>
            <td><a href="/user/${user.uid}.html">delete</a></td>
        </tr>
    </c:forEach>

    <script>

    </script>
</table>
</body>
</html>
