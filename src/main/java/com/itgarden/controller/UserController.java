package com.itgarden.controller;

//import com.itgarden.dto.CustomerInfo;
import com.itgarden.dto.CustomerInfo;
import com.itgarden.dto.EmployeeInfo;
import com.itgarden.dto.UserInfo;
import com.itgarden.entity.User;
import com.itgarden.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

//    @Autowired
//    private UserRepository userRepository;

	@GetMapping("/signup")
	public String userForm(Model m) {
		// m.addAttribute("title", "Signup Page");
		m.addAttribute("requestBody", new CustomerInfo());
		return "signup";
	}

	@GetMapping("/employee")
	public String employeeForm(Model m) {
		// m.addAttribute("title", "Signup Page");
		m.addAttribute("requestBody", new EmployeeInfo());
		return "dashboard/index";
	}

	@GetMapping("/form")
	public String form(Model m) {
		// m.addAttribute("title", "Signup Page");
		// m.addAttribute("requestBody",new EmployeeInfo());
		return "dashboard/form";
	}

//    @RequestMapping(value="/signup", method = RequestMethod.POST)
//    public String processForm(@ModelAttribute("user")User user)
//    {
//        User result= this.userRepository.save(user);
//
//        return "signup";
//    }
}
