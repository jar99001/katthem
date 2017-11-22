package com.allander.katthem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.allander.katthem.model.Savior;
import com.allander.katthem.service.SaviorService;

@Controller
@SessionAttributes("loggedIn")
public class SaviorController {

	@Autowired
	private SaviorService saviorService;
	
	@RequestMapping(value="/addSavior", method=RequestMethod.GET)
	public String displaySavior(Model model) {
		Savior savior = new Savior();
		savior.setName("Savior name");
		savior.setEmail("Savior mail address");
		model.addAttribute("savior",savior);
		return "addSavior";
	}

	
	@RequestMapping(value="/addSavior", method=RequestMethod.POST) 
	public String addSavior(@ModelAttribute("savior") Savior savior) {
		saviorService.save(savior);
		return "index";
	}

	@RequestMapping(value="/loginSavior", method=RequestMethod.GET)
	public String loginSavior(Model model) {
		Savior savior = new Savior();
		savior.setName("Savior name");
		model.addAttribute("savior",savior);
		return "loginSavior";
	}

	
	@RequestMapping(value="/loginSavior", method=RequestMethod.POST) 
	public String loginSavior(Model model,@ModelAttribute("savior") Savior loggedIn) {
		if(saviorService.checkPassword(loggedIn)) {
			Savior realSaviorObj = saviorService.getSavior(loggedIn.getName());
			model.addAttribute("loggedIn",realSaviorObj);
			System.out.println("Successfully logged in.");
		}
		return "index";
	}

	@RequestMapping(value="/logoutSavior", method=RequestMethod.GET)
	public String logoutavior(Model model, SessionStatus status) {
		Savior savior = new Savior();
		savior.setName("");
		model.addAttribute("loggedIn", savior);
		System.out.println("Successfully logged out");
		return "index";
	}

	
}
