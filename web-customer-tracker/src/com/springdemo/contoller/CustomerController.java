package com.springdemo.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springdemo.dao.CustomerDao;
import com.springdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerDao customerDao;
	
	@RequestMapping("/list")
	public String listCustomers(Model model){
		
		List<Customer> theCustomer = customerDao.getCustomer();
		System.out.println(theCustomer); 
		model.addAttribute("customers", theCustomer);
		
		
		return "list-customers";
	}
	
}
		