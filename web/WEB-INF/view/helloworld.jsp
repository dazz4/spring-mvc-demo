<!DOCTYPE html>
<html>
<head>
    <title>Hello World</title>
    <script src="${pageContext.request.contextPath}/resources/js/test.js"></script>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
<form action="processFormThree" method="get">
    <input type="text" name="name" placeholder="What's your name?" />
    <button type="submit">Submit</button>
</form>

Student name: ${param.name}<br>

<!-- accessing attribute from the model -->
The message: ${message}

</body>
</html>
