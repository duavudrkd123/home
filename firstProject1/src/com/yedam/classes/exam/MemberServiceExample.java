// 메인메소드를 담고있는 거
package com.yedam.classes.exam;

public class MemberServiceExample {
	public static void main(String[] args) {

		// db역할을 하는 구문
//		Member[] members = new Member[3];
//		members[0] = new Member("홍길동", "hong");
//		members[0].setPassword("hong123");
//		members[1] = new Member("김유신", "Kim");
//		members[1].setPassword("kim123");
//		members[2] = new Member("최재영", "Choi");
//		members[2].setPassword("choi123");

		// 로그인 정보를 ...
		Member mem1 = new Member("홍길동", "hong");
		mem1.setPassword("hong123");

//		for (int i = 0; i < mem1.length; i++) {

			MemberService mService = new MemberService();
			boolean result = mService.login(mem1.getId(), mem1.getPassword());
			if (result) {
				System.out.println(mem1.getName() + "님이 로그인 되었습니다.");
							} else {
				System.out.println("Id 또는 password를 확인하세요.");
			}

		}
	}
