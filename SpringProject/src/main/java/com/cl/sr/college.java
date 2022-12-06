package com.cl.sr;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity 
public class college {

	private int id;
	private String admin;
	private String name;
	private String location;
	
	public college() {
		super();
	}

	public college(int id, String admin, String name, String location) {
		super();
		this.id = id;
		this.admin = admin;
		this.name = name;
		this.location = location;
	}

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "college [id=" + id + ", admin=" + admin + ", name=" + name + ", location=" + location + ", getId()="
				+ getId() + ", getAdmin()=" + getAdmin() + ", getName()=" + getName() + ", getLocation()="
				+ getLocation() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
