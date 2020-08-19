package com.yedam.database;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmpMain {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in); // 컨트롤 쉬프트 o 하면 자동추가ㅈ
		EmpService service = new EmpServiceImpl();
		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.리스트  2.입력  3.수정  4.삭제  9.종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택:  ");

			try {
				int selectNo = scn.nextInt();


				if (selectNo == 1) {
					EmpDAO dao = new EmpDAO();
					Employee[] emps = dao.getEmplist();
					for (Employee emp : emps) { // for뒤에 ; 붙이면 안됨

						if (emp != null)
							System.out.println(emp);

					}

				} else if (selectNo == 2) {
					System.out.println("사원번호 입력 > ");
					int empID = scn.nextInt();
					scn.nextLine();
					System.out.println("이름 입력 > ");
					String empName = scn.nextLine();
					System.out.println("이메일 입력 > ");
					String email = scn.nextLine();
					System.out.println("입사일 입력> ");
					String hireDate = scn.nextLine();
					System.out.println("부서이름 입력 > ");
					String jobId = scn.nextLine();

//				EmpDAO dao = new EmpDAO();
					Employee emp = new Employee(empID, empName, email, hireDate, jobId);
					service.addEmp(emp); // dao.addEmployee(emp);
//수정
				} else if (selectNo == 3) {
					System.out.println("사원 조회 > ");
					int empID = scn.nextInt();
					scn.nextLine();
					System.out.println(" 살라리 변경: ");
					int ES = scn.nextInt();

					EmpDAO dao = new EmpDAO();
					Employee emp = new Employee();
//				emp.setEmployeeID(employeeID);
//				emp.setSalary(ES);
					emp.setSalary(ES);
					emp.setEmployeeID(empID);
					service.modEmp(emp);

				} else if (selectNo == 4) {
					System.out.println("사원번호 입력 > ");
					int reemp = scn.nextInt();
					scn.nextLine();

//				EmpDAO dao = new EmpDAO();
//				Employee emp = new Employee();
//				emp.setEmployeeID(reemp);

//				dao.removeEmp(emp);
					service.delEmp(reemp);
				} else if (selectNo == 9) {
					run = false;
				}
			} 
			catch (InputMismatchException e) {
				
				System.out.println("머하냐 숫자 써라-_-");
				scn =new Scanner(System.in);
			}
		}

		System.out.println("프로그램 종료");
	}

}
