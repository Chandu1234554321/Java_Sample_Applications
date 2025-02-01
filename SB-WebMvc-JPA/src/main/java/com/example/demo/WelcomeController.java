package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class WelcomeController {
	
	@GetMapping("/welcome")
	public String welcomeUser( Model m)
	{
		String userName="ChandraSekhar P";
		m.addAttribute("user",userName);
		return "welcome";
	}

}
