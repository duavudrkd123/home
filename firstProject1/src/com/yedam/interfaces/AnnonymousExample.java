package com.yedam.interfaces;

class Anonymous {
	void run() {
		System.out.println("실행.");
	}
}

interface AnonymInterface {
	void run();
}
//class ChildAnonymous extends Anonymous { }이럴필요가 없다.

public class AnnonymousExample {
	public static void main(String[] args) {
		AnonymInterface annonymIntf = () -> {
				System.out.println("자식 구현 객체 실행");	};
		annonymIntf.run();

		Anonymous anonym = new Anonymous() {
			String str;

			@Override
			void run() {
				System.out.println("자식 실행");
			}

		};
		anonym.run();

	}

}
