package com.allander.katthem.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.allander.katthem.model.Savior;

@Repository
public class SaviorRepositoryImpl implements SaviorRepository {

	@PersistenceContext
	private EntityManager em;
	
	public Savior save(Savior savior) {
		em.persist(savior);
		em.flush();
		return savior;
	}

}
