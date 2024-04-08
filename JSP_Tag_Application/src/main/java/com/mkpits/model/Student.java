package com.mkpits.model;

public class Student {
	
	public String firstName;
	public String lastName;
	public boolean isGoldCustomer;
	public Student(String firstName, String lastName, boolean isGoldCustomer) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.isGoldCustomer = isGoldCustomer;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public boolean isGoldCustomer() {
		return isGoldCustomer;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setGoldCustomer(boolean isGoldCustomer) {
		this.isGoldCustomer = isGoldCustomer;
	}
	
	
	
}
