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

	
}
