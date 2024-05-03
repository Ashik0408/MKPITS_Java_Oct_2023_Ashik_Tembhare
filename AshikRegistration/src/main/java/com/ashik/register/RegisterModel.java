package com.ashik.register;

public class RegisterModel {

	private int id;
	
	private String name;
	private String username;
	private String email;
	private String mob_no;
	private String city;
	private String password;
	
	public RegisterModel() {
		super();
	}

	public RegisterModel(int id, String name, String username, String email, String mob_no, String city,
			String password) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.mob_no = mob_no;
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

	public String getMob_no() {
		return mob_no;
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

	public void setMob_no(String mob_no) {
		this.mob_no = mob_no;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "RegisterModel [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email
				+ ", mob_no=" + mob_no + ", city=" + city + ", password=" + password + "]";
	}
	
	
}
