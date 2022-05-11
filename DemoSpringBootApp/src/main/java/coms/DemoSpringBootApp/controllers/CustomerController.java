package coms.DemoSpringBootApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import coms.DemoSpringBootApp.beans.Customer;
import coms.DemoSpringBootApp.services.CustomerService;


@Controller
public class CustomerController {

	@Autowired
	CustomerService cs;
	
	@GetMapping("/add")
	public String NewCustomer(Model m)
	{
		m.addAttribute("customer", new Customer());
		return "AddCustomer";
	}
	
	@PostMapping("/addnew")
	public String NewCustomer(@ModelAttribute  Customer customer, Model m)
	{
		System.out.println("Customer name : " + customer.getCusname());
		cs.AddNewCustomer(customer);
		m.addAttribute("customer", new Customer());
		m.addAttribute("msg", "Customer Added....");
		return "AddCustomer";
	}
	
	@GetMapping("/showall")
	public String ViewAllCustomer(Model m)
	{
		List<Customer>  cusall = cs.ShowAll();
		m.addAttribute("cusall", cusall);
		return "ViewAllCustomers";
	}
}
