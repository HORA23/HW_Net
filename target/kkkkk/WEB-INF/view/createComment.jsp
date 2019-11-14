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
    <title>Create comment</title>
</head>
<body>
<form name ="comment" action = "/addComments" method="post">
    <p>Id</p>
    <input title="Id" type="text" name = "id">
    <p>User name</p>
    <input title="User name" type="text" name = "user">
    <p>Text</p>
    <input title="Text" type="text" name = "text">
    <p>Post Id</p>
    <input title="Post_id" type="text" name = "post_id">
    <input type="submit" value="OK">
</form>
</body>
</html>
