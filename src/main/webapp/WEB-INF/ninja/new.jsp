<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: scc
  Date: 1/11/2021
  Time: 5:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        div{
            margin: 10px;
        }
    </style>
    <title>Title</title>
</head>
<body>
<center>
    <h1>New Ninja</h1>
    <form:form action="/new" method="post" modelAttribute="ninja">


        <div>
            <form:label path="dojo">Dojo</form:label>
            <form:select class="form-control" path="dojo">
                <c:forEach items="${ allDojo }" var="dojo">
                    <form:option value="${ dojo.id }"> ${ dojo.name}</form:option>
                </c:forEach>
            </form:select>


        </div>


        <div>
            <form:label path="firstName">First Name</form:label>

            <form:input path="firstName"/>

        </div>

        <div>

            <form:label path="lastName">Last Name</form:label>
            <form:input path="lastName"/>

        </div>

        <div>
            <form:label path="age">Age</form:label>
            <form:input  type="number" path="age"/>

        </div>

        <div>
            <input type="submit" value="create"/>

        </div>

    </form:form>
</center>

</body>
</html>
