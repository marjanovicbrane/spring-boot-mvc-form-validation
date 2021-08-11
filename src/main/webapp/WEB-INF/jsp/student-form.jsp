<!-- Spring MVC form tag reference for data binding -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<title>Student Registration form</title>
</head>

<body>

<!-- model attribute "student" must match with model from the StudentController class -->
<form:form action="processForm" modelAttribute="student">

First name:<form:input path="firstName" />
<br><br>
Last name:<form:input path="lastName" />
<br><br>
<input type="submit" value="Submit" />
</form:form>

</body>
</html>

