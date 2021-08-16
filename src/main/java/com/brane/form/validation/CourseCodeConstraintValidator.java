package com.brane.form.validation;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

//This is helper class CourseCodeConstraintValidator, that contains business rules/validation logic.

//This class implements ConstraintValidator interface.
//CourseCode is our annotation and String is type of data to validate against.
public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	//We are going to assign to this field coursePrefix value for the course prefix.
	//If we don't enter anything we will assign DEV prefix by default to this field.
	private String coursePrefix;
	

	@Override
	public void initialize(CourseCode theCourseCode) {

		//Now we have prefix to validate data, by default it's DEV
		coursePrefix=theCourseCode.value();
	}
	
	//Spring MVC will call this method at runtime to check is this data valid.
	//If is string valid it will return us true value, if is not it will return false value.
	//This method have 2 parameters, first is String, HTML form data entered by the user and
	//second is ConstraintValidatorContext, that is helper class for additional error messages.n
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		
		boolean result;

		//if theCode is not equal to null
		if(theCode!=null) {
			
			//Then I check if theCode starts with coursePrefix.
			//If starts returns value true, if is not returns value false.
			result=theCode.startsWith(coursePrefix);
		}else {
			
			//If nothing entered (null), just return true.
			//The course code is not required field.
			result=true;
		}
			return result;
	}

}
