package com.mkpits.registrationlogin;

public class Registration {
	
	private int id;
	private String name;
	private String username;
	private long mob_no;
	private String email;
	private String city;
	private String gender;
	private String password;
	public Registration(String name, String username, long mob_no, String email, String city, String gender,
			String password) {
		super();
		this.name = name;
		this.username = username;
		this.mob_no = mob_no;
		this.email = email;
		this.city = city;
		this.gender = gender;
		this.password = password;
	}
	public Registration(int id, String name, String username, long mob_no, String email, String city, String gender,
			String password) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.mob_no = mob_no;
		this.email = email;
		this.city = city;
		this.gender = gender;
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
	public long getMob_no() {
		return mob_no;
	}
	public String getEmail() {
		return email;
	}
	public String getCity() {
		return city;
	}
	public String getGender() {
		return gender;
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
	public void setMob_no(int mob_no) {
		this.mob_no = mob_no;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Registration [name=" + name + ", username=" + username + ", mob_no=" + mob_no + ", email=" + email
				+ ", city=" + city + ", gender=" + gender + ", password=" + password + "]";
	}
	
	
	
	

}
