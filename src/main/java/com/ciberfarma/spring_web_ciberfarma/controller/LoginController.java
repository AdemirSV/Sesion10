package com.ciberfarma.spring_web_ciberfarma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ch.qos.logback.core.model.Model;

@Controller

public class LoginController {
	
	@GetMapping({"/","login"})
	public String login(Model model) {
		return "login";
	}

	@PostMapping("ingresar")
	public String ingresar(RedirectAttributes flash) {
		return "redirect:/dashboard";
	}
	
	@GetMapping("dashboard")
	public String dashboard() {
		return "dashboard";
	}
}
