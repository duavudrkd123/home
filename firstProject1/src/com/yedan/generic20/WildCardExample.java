package com.yedan.generic20;

import com.yedan.generic20.Student.HighStudent;

public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		
	}
	
	public static void registerCorseStudent(Course<? extends Student> course) {
		//Course<Student>, Course<HighStudent>
	}
	
	public static void registerCourseWorker(Course<? super Worker> course) {
		//Course<Worker>, Course<Person>
	}
	
	public static void main(String[] args) {
		Course<Person> crsPerson = new Course<>("일반인 과정", 5);
		crsPerson.add(new Person("일반인1"));
		crsPerson.add(new Worker("직장인1"));
		crsPerson.add(new Student("학생1"));
		crsPerson.add(new HighStudent("고등학생1"));
		
		
		Course<Worker> crsWorker = new Course<>("직장인 과정", 5);
//		crsWorker.add(new Person("일반인2"));
		crsWorker.add(new Worker("직장인2"));
		
		Course<Student> crsStudent = new Course<>("학생과정", 5);
		crsStudent.add(new Student("학생2"));
		crsStudent.add(new HighStudent("고등학생2"));
		
		Course<HighStudent> crsHighStudent = new Course<>("고등학생 과정", 5);
		crsHighStudent.add(new HighStudent("고등학생3"));
		// 일반인 등록가능. Course<?> 아무타입이나 다 받겠다는것 모든 클래스를 다 받겠다.
				registerCourse(crsPerson);
				registerCourse(crsWorker);
				registerCourse(crsStudent);
				registerCourse(crsHighStudent);
		
		// 직장인 등록가능. ourse<? super Worker> course
				registerCourseWorker(crsWorker);
				registerCourseWorker(crsPerson);
//				registerCourseWorker(crsStudent); // 타입이 안맞아서 오류난다.
		// 학생 등록가능.course<? extends Student>
				registerCorseStudent(crsStudent);
				registerCorseStudent(crsHighStudent);
				
				
		
		// 고등학생등록가능.
	}

}
