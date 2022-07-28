<%--
  Created by IntelliJ IDEA.
  User: Upside
  Date: 28/07/2022
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring form</title>
</head>
<body>
<form method="post">
    <label for="paramName">paramName</label>
    <input type="text" name="paramName" id="paramName"/>

    <label for="paramDate">paramDate</label>
    <input type="date" name="paramDate" id="paramDate"/>

    <button type="submit">Send form</button>
</form>
</body>
</html>
