package com.allander.katthem.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Savior")
public class Savior {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name="Name",length=50)
	private String name;

	@Column(name="Email",length=250)
	private String email;

	@Column(name="Password")
	private String password;

	@OneToMany(mappedBy="savior",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<Cat> cats;


//	Getters & Setters

	public List<Cat> getCats() {
		return cats;
	}
	
	public String getEmail() {
		return email;
	}

	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public void setCats(List<Cat> cats) {
		this.cats = cats;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
}
