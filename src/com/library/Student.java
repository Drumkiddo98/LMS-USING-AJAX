package com.library;



public class Student {
	
	String studname;
	
	public Student() {
		
	}

	public String getStudname() {
		return studname;
	}

	public void setStudname(String studname) {
		this.studname = studname;
	}

	@Override
	public String toString() {
		return "Student [studname=" + studname + "]";
	}

	
	
}
