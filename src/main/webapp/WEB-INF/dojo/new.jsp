<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: scc
  Date: 1/11/2021
  Time: 4:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h1>New Dojo</h1>
    <form:form action="/dojos/new" method="post" modelAttribute="dojo">
        <form:label path="name"/>
        <form:errors path="name"/>
        <form:input path="name"/>
        <div style="margin: 10px">
            <input type="submit" value="create"/>
        </div>

    </form:form>
</center>

</body>
</html>
