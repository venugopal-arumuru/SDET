package coms.DemoSpringBootApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import coms.DemoSpringBootApp.beans.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	JdbcTemplate  jt;
	
	@Override
	public String AddNewCustomer(Customer cust) {			
		String res = "Error";
		String sql = "Insert into customer(cusname, gender, location, email, pasword) values(?,?,?,?,?)";
		int r = jt.update(sql, new Object[] {cust.getCusname(), cust.getGender(), cust.getLocation(), cust.getEmail(), cust.getPasword()});
		if(r>=1)
			res ="Success";
		return res;
	}

	@Override
	public List<Customer> ShowAll() {
		String sql = "Select * from Customer";
		List<Customer>  cusInfo = jt.query(sql, new BeanPropertyRowMapper(Customer.class));
		return cusInfo;
	}
}
