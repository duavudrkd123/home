package EX_15;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentTest {
public static void main(String[] args) {
//1)학생이름, 수학점수, 영어점수를 입력받고 .. (3명)
//2)수학 평균, 영어평균을 계산하는 분석
//3)수학 최고점수와 학생을 보는 최고점수
//9)종료
//프로그램을 작성하세요
//ArrayList를 사용
	Scanner scn = new Scanner(System.in);
	boolean run = true;
	String name = null;
	int ens = 0;
	int mas = 0;
	int esum = 0;
	int msum = 0;
	double eavg = 0.0;
	double mavg = 0.0;
	Set<Student> list = new HashSet<>();
	
	
	while(run) {
		System.out.println("-------------------------------------------");
		System.out.println("1. 점수입력     2. 평균분석     3. 최고점수, 학생    9. 종료 ");
		System.out.println("-------------------------------------------");
		System.out.print("선택> ");

		int seNo = scn.nextInt();scn.nextLine();
		
		if(seNo == 1) {
			System.out.println("학생이름을 입력하세요");
			name = scn.nextLine();
			System.out.println("수학점수를 입력하세요");
			mas = scn.nextInt();scn.nextLine();
			System.out.println("영어점수를 입력하세요");
			ens = scn.nextInt();scn.nextLine();
			Student student = new Student(name, mas, ens);
			set.add(student);
		} else if (seNo == 2) { //평균분석
			for (Student student : list) {
				esum = esum + student.getEns();
				msum = msum + student.getMas();
				eavg = esum/list.size();
				mavg = msum/list.size();
			}
			System.out.println("모든 학생의 영어점수의 합은: " + esum + "평균점수는: " +eavg);
			System.out.println("모든 학생의 수학점수의 합은: " + msum + "평균점수는: "+ mavg);
				
		} else if (seNo == 3) { // 최대값
			int a = 0;
			for(int i = 0; i <= list.size(); i++) {
						if (a< list.get(i));
						a >= list.get(i)
								a = list.get(i);
			}else a = a;{
						
			}
		}
	
 	
}
}
}

