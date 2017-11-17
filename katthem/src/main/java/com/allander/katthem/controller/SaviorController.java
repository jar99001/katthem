package com.allander.katthem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.allander.katthem.model.Savior;
import com.allander.katthem.service.SaviorService;

@Controller
@SessionAttributes("savior")
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
		return "redirect:index.jsp";
	}


}
