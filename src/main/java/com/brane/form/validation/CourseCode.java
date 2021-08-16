package com.brane.form.validation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

//WE WILL CREATE OUR CUSTOM VALIDATION RULE
//WE WILL CREATE CUSTOM JAVA ANNOTATION @CourseCode

//This is helper class CourseCodeConstraintValidator, that contains business rules/validation logic.
@Constraint(validatedBy=CourseCodeConstraintValidator.class)

//We can apply our annotation to a method or field
@Target({ElementType.METHOD,ElementType.FIELD})

//Keep this annotation in the compiled java bytecode, so we can use it during RUNTIME.
@Retention(RetentionPolicy.RUNTIME)


public @interface CourseCode {

	//This annotation it's gonna have 2 parameters value and message
	
	//define default course code for parameter value
	public String value() default "DEV";
	
	//define default error message for parameter message
	public String message() default "Must start with DEV";
	
	//we are not going to use groups
	public Class<?>[] groups() default {};
	
	//we are not going to use payload
	public Class<? extends Payload>[] payload() default {};
}
