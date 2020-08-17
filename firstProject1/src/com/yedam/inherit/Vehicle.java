package com.yedam.inherit;

public class Vehicle {
	void run() {
		System.out.println("차량이 달립니다. 뿌뿌~~");
	}

}

class Bus extends Vehicle {

	@Override
	void run() {
		System.out.println("버스가 달립니다. 뽀뽀~~");
		
	
	}

}

class Taxi extends Vehicle{

	@Override
	void run() {
		System.out.println("택시가 달립니다. 쏩쏩~~");
	
}
}