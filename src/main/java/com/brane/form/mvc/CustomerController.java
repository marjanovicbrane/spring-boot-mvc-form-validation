package com.brane.form.mvc;
import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/customer")
public class CustomerController {

	
	//method for showing the form, with parameter Model
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {

		//add customer object to the model
		theModel.addAttribute("customer", new Customer());
		
		return "customer-form";
	}
	
}
