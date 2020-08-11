package com.yedam.dev;

public class OperatorExample {
public static void main(String[] args) { //main컨트롤스페이스 
	int 값1 = 10;
	int 결과 = (-3) + (8 - 5) * 4 + 값1++;
	System.out.println("계산 : " + 결과);
	
	// 나머지 계산
	결과 = 10 % 7;
	System.out.println("나머지 : " + 결과);
	// 나누기 계산
	결과 = 10 / 7;
	System.out.println("나누기 : " + 결과);
	
	double 더블로계산 = 10 / 7.0; // .뒤에 계산하려면 둘중 하나는 실수파일이 되어야됨, 실습할때 7로 계산하면 1로 나옴
	System.out.println("나누기2 : " + 더블로계산);
	
	for(int 반복 = 1; 반복 <= 10; 반복++) {
		System.out.println("반복한거 : " + 반복); // 끄면 밑에꺼만 나옴
		if(반복 % 2 == 1) { 
			System.out.println(반복 + "는 홀수입니다.");//sout 컨트롤 스페이스 하면 프린트인나옴
		}else {System.out.println(반복 + "는 짝수입니다.");
	}
}
}}
