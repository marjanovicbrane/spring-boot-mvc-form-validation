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
	
	
	
		//controller method for processing the form for customer-confirmation.jsp
		//We are going to validatethe Customer object here with annotation @Valid 
		//and we are using BindingResult object to store results of validation into this object.
		@RequestMapping("/processForm")
		public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer, 
								  BindingResult theBindingResult) {
			
			
			//We are using now BindingResult object to see if we had errors.
			//If we had errors, we want to return user back to form customer-form,
			//else if everything is fine, we want to send them to confirmation page customer-confirmation.
			if(theBindingResult.hasErrors()) {
				return "customer-form";
			}
			else {		
			return "customer-confirmation";
			}
		}
	
}
