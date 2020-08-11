package com.yedam.dev;

public class VariableTest {
 public static void main(String[] args) {
	 	//b = b + 1;
	 	 // 1 ~ 10까지 더하기
int b = 0;
int sum = 0;
int result = 0; //이렇게 하면 중복선언이 된다  둘중 하나는 ㅈ니워야하나다

for(int i = 0; i < 10; i++) {//반복횟수에는 b를 안넣어도됨 i는 반복횟수
	int result = 0; //이렇게 하면 중복선언이 된다
	b = b + 1;
	sum = sum + b; // sum += b
	System.out.println("sum = " + sum + ", b =" + b);
	}

 }
}

