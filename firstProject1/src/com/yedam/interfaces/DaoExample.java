package com.yedam.interfaces;

public class DaoExample {
	public static void main(String[] args) {

//		MySqlDb dao = new MySqlDb(); 
		DataAccessObject dao = new MySqlDb(); //인터페이스 사용
		// oracledb를 사용하다 mysqldb를 사용하면 다 바꿔줘야됨
		// ex) OracleDb dao = new OracleDb(); ->MySqlDb dao = new MySqlDb();
		// 근데 인터페이스를 사용하면
		// 바꾸는 방법
		//DataAccessObject dao = new MySqlDb(); ->
//		/DataAccessObject dao = new OracleDb();
		// 다 안고쳐도 된다.
		dao.select();
		dao.insert();
		dao.update();

	}

}
