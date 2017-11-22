package com.allander.katthem.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.allander.katthem.model.Cat;
import com.allander.katthem.model.Savior;
import com.allander.katthem.service.CatService;

@Controller
public class CatController {

	@Autowired
	private CatService catService;
	
	@RequestMapping(value="/showCats", method=RequestMethod.GET)
	public String showCats(Model model) {
		// Get cats from DB and send them to angular
		List<Cat> cats = catService.findAll();
			model.addAttribute("cats",cats);
		return "showCats";
	}	
	
	
	@RequestMapping(value="/addCat", method=RequestMethod.GET)
	public String addCat(Model model) {
		Cat catObj = new Cat();
		catObj.setName("Cat name");
		model.addAttribute("catObj",catObj);
		return "addCat";
	}

	@RequestMapping(value="/addCat",method=RequestMethod.POST) 
	public String addCat(@ModelAttribute("catObj") Cat catObj, HttpSession session) {
		Savior savior = (Savior)session.getAttribute("loggedIn");
		catObj.setSavior(savior);
		catService.save(catObj);
		return "index";
	}
	
}
