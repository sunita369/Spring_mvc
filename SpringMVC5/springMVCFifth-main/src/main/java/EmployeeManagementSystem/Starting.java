package EmployeeManagementSystem;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class Starting {
	
	@RequestMapping(value = "/details", method = RequestMethod.GET)
	public String showLoginPage() {
		return "start";
	}
}
