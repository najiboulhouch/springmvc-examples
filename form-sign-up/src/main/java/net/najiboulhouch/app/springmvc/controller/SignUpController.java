/**
 * 
 */
package net.najiboulhouch.app.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import net.najiboulhouch.app.springmvc.model.SignUpForm;

/**
 * @author NAJIB
 * @version 1.0 
 */

@Controller
public class SignUpController {

	
	@GetMapping("/showSignUpForm")
	public String showForm() {
		return "signup-form";
	}
	
	@ModelAttribute("signUpForm")
	public SignUpForm setSinForm() {
		return new SignUpForm();
	}
	
	@PostMapping("/saveSignUpForm")
	public String registerUser(@ModelAttribute("signUpForm") SignUpForm signUpForm ,Model model ) {
		System.out.println("FirstName : " + signUpForm.getFirstName());
        System.out.println("LastName : " + signUpForm.getLastName());
        System.out.println("Username : " + signUpForm.getUserName());
        System.out.println("Password : " + signUpForm.getPassword());
        System.out.println("Email : " + signUpForm.getEmail());
        
        model.addAttribute("message" , "User SignUp Successfuly");
        model.addAttribute("user" , signUpForm);
        return "signup-success";
	}
}
