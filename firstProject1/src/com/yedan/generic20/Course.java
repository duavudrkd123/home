package com.yedan.generic20;

public class Course<T> {
	private String courseName;
	private T[] students;
	
	public Course(String courseName, int capacity) {
		this.courseName = courseName;
		this.students = (T[]) new Object[capacity];
	}

	public String getCourseName() {
		return courseName;
	}



	public T[] getStudents() {
		return students;
	}

public void add(T t) {
	for (int i = 0 ; i<students.length; i++) {
		if (students[i] == null ) {
			students[i] = t;
			break;
		}
	}
}
	
}
