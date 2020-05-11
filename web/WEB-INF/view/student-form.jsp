<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
    First name: <form:input path="firstName" /><br><br>
    Last name: <form:input path="lastName" /><br><br>
    <form:select path="country">
        <form:options items="${student.countryOptions}" />
    </form:select><br><br>
    <form:radiobuttons path="language" items="${student.favoriteLanguages}" /><br><br>
    Linux: <form:checkbox path="systems" value="Linux"></form:checkbox>
    Windows: <form:checkbox path="systems" value="Windows"></form:checkbox>
    Mac OS: <form:checkbox path="systems" value="Mac OS"></form:checkbox>
    <input type="submit" value="Submit" />
</form:form>
</body>
</html>
