package com.yedam.classes.statics;

public class Singleton {
	private static Singleton singleton = new Singleton();
	//  static 클래스에 제한시킨다는 뜻
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return singleton;
	}

}
