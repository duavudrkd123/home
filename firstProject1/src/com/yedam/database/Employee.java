package com.yedam.database;

//필요한 필드, 메소드를 정리할 예정
public class Employee {
	private int employeeID;// not null nn
	private String firstName;
	private String lastName;// nn
	private String email;// nn
	private String phoneNumber;
	private String hireDate;// nn
	private String jobId;// nn
	private int salary;
	
	public Employee() {}

	public Employee(int employeeID, String lastName, String email, String hireDate, String jobId) {
		super();
		this.employeeID = employeeID;
		this.lastName = lastName;
		this.email = email;
		this.hireDate = hireDate;
		this.jobId = jobId;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", phoneNumber=" + phoneNumber + ", hireDate=" + hireDate + ", jobId=" + jobId + ", salary="
				+ salary + "]";
	}// 제네레이트 투스트링 하면 오버라이트가 생성 된다

}
