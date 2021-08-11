package com.brane.form.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	//root:http://localhost:8080/
	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
	
}
