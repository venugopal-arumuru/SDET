package com.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jdbc.bean.Employee;
import com.jdbc.service.EmpService;
import com.jdbc.service.EmpServiceImpl;

@Controller
public class EmpController {

	@Autowired
	EmpService es;
	
	@RequestMapping(value="/addemp", method=RequestMethod.GET)
	public String AddNewEmployee()
	{
		return "AddNewEmp";  // here Page1 is, Page1.jsp
	}
	
	
	@RequestMapping(value="/empProcess", method=RequestMethod.POST)
	public String AddNewEmployee(@RequestParam("txtEno") String eno, 
			@RequestParam("txtEname") String ename, 
			@RequestParam("ddlJob") String job, 
			@RequestParam("txtSal") String sal,
			Model m)
	{
		
		Employee emp = new Employee();
		emp.setEmpno(Integer.parseInt(eno));
		emp.setEmpname(ename);
		emp.setJob(job);
		emp.setSal(Integer.parseInt(sal));	
		
			if(es.AddEmployee(emp).equals("S"))
				m.addAttribute("msg", "Employee Added...");
			else
				m.addAttribute("msg", "Employee Not Added....");
		return "AddNewEmp";  
	}
	
	@RequestMapping(value="/viewemp", method=RequestMethod.GET)
	public String ViewAllEmployees(Model m)
	{
		List<Employee>  empall = es.ShowAll();
		m.addAttribute("empall", empall);
		return "ViewAllEmps";  
	}

}
