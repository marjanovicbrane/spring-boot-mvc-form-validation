<!-- Spring MVC form tag reference for data binding -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
<head>
	<title>Customer Registration Form</title>

	<style>
		.error {color:red}
	</style>
</head>
	
<body>

<i>Fill out the form.Fields with symbol (*) means that is required.</i>
<br><br>
	<form:form action="processForm" modelAttribute="customer">
	First Name:<form:input path="firstName" />
	<br><br>
	Last Name (*):<form:input path="lastName" />
	
	<!-- we want to show here an error message, because we added a validation rules
	in our class Customer and we also want to apply css styles calling class name error -->
	<form:errors path="lastName" cssClass="error" />

	<br><br>
	
	Free Passes:<form:input path="freePasses" />
	<form:errors path="freePasses" cssClass="error" />
	
	<br><br>
	
	<input type="submit" value="Submit" />
	</form:form>

</body>
</html>