<%@ page import="org.elosztott.model.NewUserRequest" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: makra
  Date: 2016. 09. 26.
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New user</title>
</head>
<body>
New user

<%
    NewUserRequest newUserRequest = (NewUserRequest)request.getAttribute("newUserRequest");
%>

<form modelAttribute="newUserRequest" th:action="@{/}" th:object="${userForm}" method="post">
    Username:
    <input type="text" th:field="*{username}" name="Username"><br>
    <%--<span th:if= "${#fields.hasErrors("username")}" th:errors="*{name}">Name Error</span>--%>
    Vegzettseg:
    <select path="vegzettseg">
        <option value="ELEM">általános</option>
        <option value="HIGH">középiskola</option>
        <option value="COLLEGE">főiskola</option>
        <option value="UNI">egyetem</option>
    </select>
    Kedvenc szín:
    <input type="checkbox" path="color" value="blue">Kék<br>
    <input type="checkbox" path="color" value="red">Piros<br>

    Nem:
    <input type="radio" path="gender" value="male">Férfi<br>
    <input type="radio" path="gender" value="female">Nő<br>

    <input type="submit" value="Submit">
</form>
</body>
</html>