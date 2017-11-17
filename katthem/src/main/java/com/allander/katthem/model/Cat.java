package com.allander.katthem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cat")
public class Cat {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;

	@Column(name="name",length=30)
	private String name;

	@Column(name="description",length=5000)
	private String Description;

	
//	< Getters & Setters>
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return Description;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
}
