<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Student confirmation</title>
</head>
<body>
    The student if confirmed: ${student.firstName} ${student.lastName}<br><br>
    Country: ${student.country}<br><br>
    Favorite language: ${student.language}<br><br>
    Operating systems:
    <ul>
        <c:forEach var="temp" items="${student.systems}">
            <li>${temp}</li>
        </c:forEach>
    </ul>
</body>
</html>
