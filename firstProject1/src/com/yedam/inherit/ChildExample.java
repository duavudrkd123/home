package com.yedam.inherit;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child("홍길동", 15, 10);
		child.getName(); // 차일드에는 없지만 부모 클래스에 있어서 받아올수 있음 (get name을)
		child.getAge();// 차일드에는 없지만 부모 클래스에 있어서 받아올수 있음 (get age를)
		child.getGrade(); // 자신 child 에 있는 getGrade를 가져올수 있음
		
		Parent parent = new Child("김유신", 20, 20);
		parent.getName();
		parent.getAge();
//		parent.getGrade();  // 그레이드는 자식꺼라서 받아(호출)올수 없음
		
		Vehicle v1 = new Taxi(); //vehicle은 부모요소라서, 실행할수있다
		v1.run();
		v1 = new Bus();// 똑같은 run이지만 실행되는게 다르다
		v1.run();		//이렇게 적어주면 두가지 값이 출력된다.
		
		Driver driver = new Driver();// 이렇게 되는 이유는
		driver.drive(new Taxi()); //vehicle 클래스에 상속받는게 다 올수있다.
		driver.drive(new Bus());
		
		Parent parent1 = new Parent();
		 System.out.println(parent1.toString());
		
		

	}
}
