package com.allander.katthem.repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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

	public Savior getSavior(String userName) throws NoResultException {
			Query query = em.createQuery("Select s from Savior s where s.name = :name");
			query.setParameter("name", userName);
			Savior dbSavior = (Savior) query.getSingleResult();
			return dbSavior;
	}
}

