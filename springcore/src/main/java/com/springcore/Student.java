package com.springcore;

public class Student {
	
	private int studId;
	private String studName;
	private String studAddrss;
	
	// constructor
	public Student() {
		super();
	}
	// parameterized constructor
	public Student(int studId, String studName, String studAddrss) {
		this.studId = studId;
		this.studName = studName;
		this.studAddrss = studAddrss;
	}
	
	// getter Setters
	public int getStudId() {
		return studId;
	}
	public String getStudName() {
		return studName;
	}
	public String getStudAddrss() {
		return studAddrss;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public void setStudAddrss(String studAddrss) {
		this.studAddrss = studAddrss;
	}
	
	// toString method
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studeName=" + studName + ", studAddrss=" + studAddrss + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
