<%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 12.11.2019
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>All posts</title>
</head>
<body>
<h1>Posts lists</h1>
<table>
<jsp:useBean id="posts" scope="request" type="java.util.List"/>
<c:forEach items="${posts}" var="p">
<tr>
    <th width="100px" height="50px">Id</th>
    <td>${p.id}</td>
    <td><a href ="/delete/${p.id}">DELETE</a></td>
    <td><a href = "${p.id}">SEE ALL COMMENTS</a></td>
        <%--<td><a href="/post/${p.id}">${p.id}</a></td>--%>
        <%--<td><a href ="/update/${p.id}">UPDATE</a></td>--%>
    <%--<td><a href ="${p.id}/comments/">SHOW COMMENTS</a></td>--%>
</tr>
    <tr>
        <th>Title</th>
        <td width="100px">${p.title}</td>

    </tr>

    <tr>
        <th width="100px" height="30px">Text</th>
        <td width="200px" height="50px">${p.text}</td>
    </tr>
</c:forEach>
</table>
<a href="/addPost">CREATE POST</a>
</body>
</html>