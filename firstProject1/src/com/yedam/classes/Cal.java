package com.yedam.classes;

public class Cal {
	private int r; // r을 반지름의 의미로 사용할것이다. 
	private double pi = 3.14;
	//메소드로 -값이 계산 되지 못하게 기능을 넣어준다
	public void setRadius (int r) { //if에서 else를 안쓰면 0나오고 작지않으면 
		if(r<0)
			r=0;
		else 
			this.r = r;  //(이 r은 r이다. this r is all r)
	}
	// calexample에서 getRadius라는 메소드를 사용할수 있게 만들어주는것
	public int getRadius() {
		return r;
	}

	public double getArea() {
		double result = pi * r * r;
		return result;

	}
}
