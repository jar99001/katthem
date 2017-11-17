package com.allander.katthem.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.allander.katthem.model.Cat;

@Repository
public class CatRepositoryImpl implements CatRepository {

	@PersistenceContext
	private EntityManager em;
	
	public Cat save(Cat cat) {
		em.persist(cat);
		em.flush();
		return cat;
	}

	@SuppressWarnings("unchecked")
	public List<Cat> findAll() {
		Query query = em.createQuery("Select c from Cat c");
		List<Cat> cats = query.getResultList();
		System.out.println(cats.size());
		return cats;
	}

}
