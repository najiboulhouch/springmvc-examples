/**
 * 
 */
package net.najiboulhouch.app.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.najiboulhouch.app.springmvc.entity.Customer;
import net.najiboulhouch.app.springmvc.service.CustomerService;

/**
 * @author NAJIB
 * @version 1.0 
 */

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/list")
	public String listCustomers(Model model) {
		List<Customer> customers = customerService.getCustomers();
		model.addAttribute("customers" , customers);
		return "list-customers";
	}
	
	@GetMapping("/showForm")
	public String showFormForAdd(Model model) {
		model.addAttribute("customer" , new Customer());
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		customerService.saveCustomer(customer);
		return "redirect:/customer/list";
	}
	
	@GetMapping("/updateForm")
	public String showFormForUpdate(@RequestParam("customerId") int id , Model model) {
		Customer customer = customerService.getCustomer(id);
		model.addAttribute("customer" , customer);
		return "customer-form";
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int id) {
		customerService.deleteCustomer(id);
		return "redirect:/customer/list";
	}
	
}
