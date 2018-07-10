package com.test.entity;

import java.util.Date;

public class User {
	private String id;
	private String name;
	private String password;
	private Date date;
	
    

	public User() {
		super();
	}
	
	

	public User(String id, String name, String password, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.date = date;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
