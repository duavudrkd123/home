package com.yedam.classes;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("염평강");
		p1.setAge(26);

		System.out.println(p1.getName());
		System.out.println(p1.getAge());

		Person cjh = new Person();
		cjh.setName("최재영");
		cjh.setAge(25);
		System.out.println(cjh);

		Person ksm = new Person();
		ksm.setName("김상민");
		ksm.setAge(26);

		Person ksm2 = new Person();
		ksm2.setName("김상민");
		ksm2.setAge(26);

//		System.out.println(ksm == ksm2); // 주소값이 달라서 false라고출력

//		System.out.println(ksm); // 실제 주소값이 나온다.

		System.out.println(ksm.getName() == (ksm2.getName()));
		// true라고 나온다 기본타입은 == 다른타입은 equals로 비교한다.

		String str1 = "";
		String str2 = "";
		;

		Person[] pAry = { cjh, ksm, ksm2 };
		for (int i = 0; i < pAry.length; i++) {
			pAry[i].introduce(); // pAry만큼 public string introduce 돌려서 출력
			System.out.println(pAry[i].introduce()); // 이름출력해야됨 ㅇㄹ
		}
//		Person anoy = new Person();
//		System.out.println(anoy.introduce());

//		public Person() { //매개값이 생성자를 기본생성자(default constructror) 
//			name = "annonymous";
//			age = 10;

		Person anoy = new Person("민헤주");
		anoy.name = "최형준";
		anoy.age = 28;
		System.out.println(anoy.introduce());
//	public Person(String name) {
//		this.name = name;

		Person hsj = new Person("하즹", 20);
		hsj.setName("김시무");
		hsj.setAge(13);
		System.out.println(hsj.introduce());
	}

}
