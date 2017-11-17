package com.allander.katthem.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allander.katthem.model.Cat;
import com.allander.katthem.repository.CatRepository;

@Service
public class CatServiceImpl implements CatService {

	@Autowired
	private CatRepository catRepository;
	
	@Transactional
	public Cat save(Cat cat) {
		return catRepository.save(cat);
	}

	public List<Cat> findAll() {
		return catRepository.findAll();		
	}
	
}
