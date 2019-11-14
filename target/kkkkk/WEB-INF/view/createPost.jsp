<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 14.11.2019
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create user page</title>
</head>
<body>
<form name ="post" action = "/addPost" method="post">
    <p>Id</p>
    <input title="Id" type="text" name = "id">
    <p>Title</p>
    <input title="Title" type="text" name = "title">
    <p>Text</p>
    <input title="Text" type="text" name = "text">
    <input type="submit" value="OK">
</form>
</body>
</html>
