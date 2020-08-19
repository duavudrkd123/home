package com.yedam.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO {
	// 수정
	public void modEmployee (Employee emp) {
		Connection conn = DBConnection.getConnection();
		String sql = "update emp_temp set   salary = "+ emp.getSalary()
		+ "where employee_Id" + "=" + emp.getEmployeeID();
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r + " 수정 되었습니다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	}

	// 입력
	public void addEmployee(Employee emp) {// 이 메소드를 불러오면
		Connection conn = DBConnection.getConnection(); // 데이터 베이스 연결하려면 적어줘야됨
		String sql = "insert into emp_temp(employee_id, last_name, email, hire_date, job_id)" + "values("
				+ emp.getEmployeeID() + ",\'" + emp.getLastName() + "\',\'" + emp.getEmail() + "\',\' "
				+ emp.getHireDate() + "\',\' " + emp.getJobId() + "\' ) "; // 인서트 구문을 만들어주는것
		System.out.println(sql);

		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r + " 건이 입력되었습니다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 삭제
	public void removeEmp(int empId) {
		Connection conn = DBConnection.getConnection();
		String sql = "delete from emp_temp where employee_id =" + empId;
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r + " 건이 제거되었습니다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	public Employee[] getEmplist() {
		// insert into emp_temp(employee_id, last_name, email, hire_date, job_id)
//		values (301, 'test', 'test', '2020-05-05', 'IT_PROG';
		Connection conn = DBConnection.getConnection();
		Employee[] employees = new Employee[100]; // 배열을 설정해주기
		try {
			String sql = "select * from emp_temp";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			int idx = 0;
			while (rs.next()) {
				Employee emp = new Employee(); // 기본생성자를 만들어 줘야됨
				String firstName = rs.getString("first_name");
				emp.setFirstName(firstName);
				emp.setLastName(rs.getString("last_name"));
				// set 구문 넣어보기
				emp.setEmployeeID(rs.getInt("employee_id"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));

				employees[idx++] = emp;
			}
			System.out.println("=-- end of data --=");
		} catch (SQLException e) {
			e.printStackTrace();
		}
//		return null;// 리턴 구문이 없으면 에러가 난다
		return employees; // 반환해준다. employees 에러가 난다.
	}// get emp list의 끝

}// 클래스 의 끝
