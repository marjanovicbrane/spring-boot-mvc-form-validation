package com.brane.form.mvc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/student")
public class StudentController {
	
	
	//method for showing the form, with parameter Model
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {

		//create an empty student object
		Student theStudent=new Student();
		
		//add student object to the model
		theModel.addAttribute("student", theStudent);

		return "student-form";
	}

	
	//controller method for processing the form 1 for student-confirmation.jsp
	//Because we are using SPRING MVC FORM TAG, we can now use annotation @ModelAttrbute,
	//to binds data (object) from the form.
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		//Just for debugging, we are going to print out this information.
		System.out.println("theStudent:"+theStudent.getFirstName()+" "+theStudent.getLastName());
		
		return "student-confirmation";
	}
}
