package com.allander.katthem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.allander.katthem.model.Cat;
import com.allander.katthem.service.CatService;

@RestController
public class CatControllerREST {

	@Autowired
	private CatService catService;

	@RequestMapping("/showCatsJ")
	public @ResponseBody List<Cat> showCatsJson(Model model) {
		// Get cats from DB and send them to angular
		List<Cat> cats = catService.findAll();
		return cats;
	}	

}
