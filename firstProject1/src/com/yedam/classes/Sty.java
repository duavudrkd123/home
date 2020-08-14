package com.yedam.classes;

public class Sty {

	Student s2 = new Student(222, "김유신", "말타기");
	Student s3 = new Student(333, "최재영", "역도");
	Student s4 = new Student(444, "미네주", "신내림");
	
	String searchName = "김유신";
	String searchMajor = "신내림";
	
	Student[] sAry = { s1 , s2 };
	for (Student s : sAry) {
		if(s.getStudeName().equals(searchMajor))
			System.out.println(s.toString());
	}
}
