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

<!-- read list of countries from a Java class -->
Country:<form:select path="country">
		<form:options items="${student.countryOptions}" />
</form:select>

<!--  
Country:<form:select path="country">
		<form:option value="SERBIA" label="Serbia" />
		<form:option value="America" label="USA" />
		<form:option value="CUBA" label="Cuba" />
		<form:option value="Brasil" label="Brasil" />
		<form:option value="Australia" label="Australia" /> 
		</form:select>
-->

<br><br>
<input type="submit" value="Submit" />

</form:form>

</body>
</html>

