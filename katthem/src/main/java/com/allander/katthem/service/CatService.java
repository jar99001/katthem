package com.allander.katthem.service;

import java.util.List;

import com.allander.katthem.model.Cat;

public interface CatService {
	Cat save(Cat cat);
	List<Cat> findAll();
}
