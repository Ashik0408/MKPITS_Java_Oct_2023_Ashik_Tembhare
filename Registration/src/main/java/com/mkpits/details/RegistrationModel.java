package com.mkpits.details;

public class RegistrationModel 
{
	private int id;
	private String name;
	private String username;
	private String email ;
	private String mob;
	private String city;
	private String password;
	
	public RegistrationModel(String name, String username, String email, String mob, String city, String password) {
		super();
		this.name = name;
		this.username = username;
		this.email = email;
		this.mob = mob;
		this.city = city;
		this.password = password;
	}
	
	
	public RegistrationModel(int id, String name, String username, String email, String mob, String city,
			String password) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.mob = mob;
		this.city = city;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getUsername() {
		return username;
	}
	public String getEmail() {
		return email;
	}
	public String getMob() {
		return mob;
	}
	public String getCity() {
		return city;
	}
	public String getPassword() {
		return password;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "RegistrationModel [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email
				+ ", mob=" + mob + ", city=" + city + ", password=" + password + "]";
	}


	


	
	
	
	
	
	
	
	
}
