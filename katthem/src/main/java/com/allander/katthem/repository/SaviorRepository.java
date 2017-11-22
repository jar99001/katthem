package com.allander.katthem.repository;

import com.allander.katthem.model.Savior;

public interface SaviorRepository {
	Savior save(Savior savior);

	Savior getSavior(String userName);
}
