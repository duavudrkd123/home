package com.yedam.interfaces;

public interface DataAccessObject {

	
	//	public void delete){} // 이런 메소드는 못오고 추상 메소드만 올수있다
	
	
	public void select(); //abstract 안적어도 추상으로 적용된다
	public void insert();
	public void update();
}
