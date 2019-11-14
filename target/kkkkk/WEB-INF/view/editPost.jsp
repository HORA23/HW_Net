
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

<form name ="post" action = "/updatePost" method="post">
    <jsp:useBean id="post" scope="request" type="com.testKhoroshev.entity.Post "/>
    <p>Id</p>
    <input title="Id" type="text" name = "id" value ="${post.id}">

    <p>Text</p>
    <input title="Text" type="text" name = "text" value ="${post.text}">
    <p>Title</p>
    <input title="Title" type="text" name = "title" value ="${post.title}">
    <input type="submit" value="OK">
</form>
</body>
</html>
