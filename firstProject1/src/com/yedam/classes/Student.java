package com.yedam.classes;

public class Student {
	String stn;
	String name;
	String course;

	public Student() {
		stn = "anyNum";
		name = "John Do";
		course = "Korean";

	}

	public Student(String stn) {
		this.stn = stn;
	}

	public Student(String stn, String name) {
		this.stn = stn;
		this.name = name;
	}

	public Student(String stn, String name, String course) {
		this.stn = stn;
		this.name = name;
		this.course = course;
	}

	

	

	public String getstn() {
		return stn;
	}

	public String getname() {
		return name;
	}

	public String getcourse() {
		return course;
	}
	@Override
	public String
}
