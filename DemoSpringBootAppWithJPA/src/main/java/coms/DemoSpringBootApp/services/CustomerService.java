package coms.DemoSpringBootApp.services;
import java.util.*;
import coms.DemoSpringBootApp.beans.*;
public interface CustomerService {
	public String AddNewCustomer(Customer cust);
	public List<Customer> ShowAll();	
}

