package com.allander.katthem.service;

import com.allander.katthem.model.Savior;

public interface SaviorService {
	Savior save(Savior savior);

	boolean checkPassword(Savior savior);

	Savior getSavior(String name);
}
