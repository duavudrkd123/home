package com.yedam.database;

public interface EmpService {
	public Employee[] showList(); // 전체리스트 보여줌

	public void addEmp(Employee emp); // 입력처리

	public void modEmp(Employee emp); // 수정처리

	public void delEmp(int empid); // 삭제처리
}
