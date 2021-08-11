package com.brane.form.mvc;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/hello")
public class HelloWorldController {


	//localhost:8080/hello/showForm
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	//controller method for processing 1 the form for helloworld-form.jsp
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//controller method for processing 2 the form for helloworld-form.jsp
	//Read form data (example 1) and add data to the model message and show new message from the model.
	//HttpServletRequest object holds data from HTML form (READING FORM DATA).
	@RequestMapping("/processFormVersionTwo")
	public String UpperCase(HttpServletRequest request,Model model) {

		String theName=request.getParameter("studentName");

		theName=theName.toUpperCase();

		String result="Hi! "+theName;
		
		model.addAttribute("message1", result);
		
		return "helloworld";
	}
	
	
	//controller method for processing 3 the form for helloworld-form.jsp
	//Read form data (example 2) and add data to the model message and show new message from the model.
	//@RequestParam annotation binds data automatically from HTML form (READING FORM DATA).
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName,Model model) {

		theName=theName.toUpperCase();

		String result="Hey my web developer friends! "+theName;

		model.addAttribute("message2", result);

		return "helloworld";
	}
	
	
}
