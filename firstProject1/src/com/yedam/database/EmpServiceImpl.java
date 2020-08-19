package com.yedam.database;

public class EmpServiceImpl implements EmpService {

	EmpDAO dao = new EmpDAO();
//조회
	@Override
	public Employee[] showList() {
		return dao.getEmplist();
	}
//추가
	@Override
	public void addEmp(Employee emp) {
		dao.addEmployee(emp);
	}
//수정
	@Override
	public void modEmp(Employee emp) {
		dao.modEmployee(emp);
	}
//삭제
	@Override
	public void delEmp(int empId) {
		dao.removeEmp(empId);
	}

}
