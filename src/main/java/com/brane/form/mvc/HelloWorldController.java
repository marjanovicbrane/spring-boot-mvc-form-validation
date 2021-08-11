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

	//controller method for process form 1 for helloworld-form.jsp
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//controller method for process form 2 for helloworld-form.jsp
	//Read form data and add data to the model message and show new message fromthe model.
	//HttpServletRequest holds data from HTML form.
	@RequestMapping("/processFormVersionTwo")
	public String letsGetLoud(HttpServletRequest request,Model model) {

		String theName=request.getParameter("studentName");

		theName=theName.toUpperCase();

		String result="Hi! "+theName;
		
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	
}
