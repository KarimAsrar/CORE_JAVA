package com.ts.SpringBootProject40.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")

public class User {
	
	public User(String email, String password, String about) {
		super();
		Email = email;
		Password = password;
		this.about = about;
	}
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	
	private int id;
	
	@Column(name="user_name,nullable = false, lentgh = 100")
	private String name;
	private String Email;
	private String Password;
	private String about;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	
	
	
}
