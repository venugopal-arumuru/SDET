package coms.DemoSpringBootApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import coms.DemoSpringBootApp.Repo.CustomerRepo;
import coms.DemoSpringBootApp.beans.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepo  cr;
	
	@Override
	public String AddNewCustomer(Customer cust) {
		String res = "Error";
		Customer cus = cr.save(cust);
		if(cus!=null)
			res= "Success";
		
		return res;
	}

	@Override
	public List<Customer> ShowAll() {
		List<Customer>  cusall = cr.findAll();
		return cusall;
	}
}
