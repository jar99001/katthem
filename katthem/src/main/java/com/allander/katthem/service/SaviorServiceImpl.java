package com.allander.katthem.service;

import javax.persistence.NoResultException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allander.katthem.model.Savior;
import com.allander.katthem.repository.SaviorRepository;

@Service
public class SaviorServiceImpl implements SaviorService {

	@Autowired
	private SaviorRepository saviorRepository;
	
	@Transactional
	public Savior save(Savior savior) {
		saviorRepository.save(savior);
		return savior;
	}

	public boolean checkPassword(Savior savior) {
		try {
			System.out.println("looking up");
			System.out.flush();
			Savior dbSavior = saviorRepository.getSavior(savior.getName());
			System.out.println("Comparing ");
			System.out.flush();
			if(dbSavior.getPassword().equals(savior.getPassword())) {
				System.out.println("Strings equal");
				System.out.flush();
				// Strings are equal
				return true;
			} else return false;
		} catch(NoResultException e) {
			System.out.println("No entity in DB");
			System.out.flush();
			return false;
		}
	}

	public Savior getSavior(String name) {
		return saviorRepository.getSavior(name);
	}
}
