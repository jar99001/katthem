package com.allander.katthem.service;

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

}
