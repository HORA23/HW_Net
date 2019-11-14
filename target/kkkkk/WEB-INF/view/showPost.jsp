

<%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 14.11.2019
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="post" scope="request" type="com.testKhoroshev.entity.Post"/>
<h1>Post info</h1>

<table>
    <tr>
        <td>Id</td>
        <td>${post.title}</td>
    </tr>
    <tr>
        <td>Title</td>
        <td>${post.title}</td>
    </tr>
    <tr>
        <td>Text</td>
        <td>${post.text}</td>
    </tr>
</table>
<br>
<a href="/posts">Back</a>
</body>
</html>
