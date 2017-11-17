package com.allander.katthem.repository;

import java.util.List;

import com.allander.katthem.model.Cat;

public interface CatRepository {
	Cat save(Cat cat);
	List<Cat>findAll();
}
