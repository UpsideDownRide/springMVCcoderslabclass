<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Upside
  Date: 28/07/2022
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Multiplication Table</title>
    <style>
        table {
            border-collapse: collapse;
        }

        thead > tr {
            background-color: #666666;
            color: #FFFFFF;
        }

        table td {
            background-color: #E7E7E7;

        }

        table td, table th {
            padding: 1rem 1.5rem;
            border: 1px solid rgb(219, 219, 219);
        }
    </style>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>x</th>
        <c:forEach var="columnHeadValue" begin="1" end="${columns}">
            <th>${columnHeadValue}</th>
        </c:forEach>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="rowValue" begin="1" end="${rows}">
        <tr>
            <td>${rowValue}</td>
            <c:forEach var="columnValue" begin="1" end="${columns}">
                <td>${rowValue * columnValue}</td>
            </c:forEach>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
