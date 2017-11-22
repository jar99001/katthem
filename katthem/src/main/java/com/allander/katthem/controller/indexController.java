package com.allander.katthem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("loggedIn")
public class indexController {

	@RequestMapping(value="/index.html")
	public String index(Model model, SessionStatus status) {
		return "index";
	}
	
}
