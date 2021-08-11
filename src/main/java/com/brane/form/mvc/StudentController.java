package com.brane.form.mvc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



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

}
