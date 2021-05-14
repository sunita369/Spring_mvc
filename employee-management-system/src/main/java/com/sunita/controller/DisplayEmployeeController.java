package com.sunita.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sunita.domain.Employee;
import com.sunita.service.EmployeeService;

@Controller
public class DisplayEmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/viewAllEmployees")
	public ModelAndView viewAllItems() {
		List<Employee> allEmployees = employeeService.getAllEmployees();
		return new ModelAndView("/displayAllEmployees.jsp", "allEmployees",
				allEmployees);
	}
}