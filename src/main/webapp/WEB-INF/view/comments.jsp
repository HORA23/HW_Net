<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>All comments for post</title>
</head>
<body>
<h1>Comment`s lists</h1>
<table>
    <jsp:useBean id="comments" scope="request" type="java.util.List"/>
    <c:forEach items="${comments}" var="p">
        <tr>
            <th width="100px" height="50px">Id</th>
            <td>${p.id}</td>
            <td><a href ="/deleteCom/${p.id}">DELETE</a></td>
        </tr>
        <tr>
            <th width="100px">Text</th>
            <td>${p.text}</td>
        </tr>
        <tr>
            <th width="100px" height="30px">User`s name</th>
            <td width="200px" height="50px">${p.user}</td>
        </tr>
        </c:forEach>

            <%--<td><a href="/post/${p.id}">${p.id}</a></td> --%>
            <%--
            <td><a href="/post/${comments.id}">${comments.id}</a></td>
    --%>


</table>
<a href="/addComments">CREATE COMMENTS</a>
<a href="/posts">BACK</a>
</body>
</html>