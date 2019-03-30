package com.employee.java;

import java.util.Scanner;

public class Employee {
	Scanner input = new Scanner(System.in);

	private int employeeId;
	private String employeeName;
	private String dob;
	private String gender;
	private String city;
	private String emailId;
	
	private String designation;
	private String department;
	private Double salary;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public Employee() {

	}
	

	

	
	public Employee(int employeeId, String employeeName, String dob,String gender, String city,
			String emailId, String designation, String department, Double salary) {
		
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.dob = dob;
		this.gender = gender;
		this.city = city;
		this.emailId = emailId;
		this.designation = designation;
		this.department = department;
		this.salary = salary;
	}
	public Employee( String employeeName, String dob,String gender, String city,
			String emailId, String designation, String department, Double salary) {
		
		
		this.employeeName = employeeName;
		this.dob = dob;
		this.gender = gender;
		this.city = city;
		this.emailId = emailId;
		this.designation = designation;
		this.department = department;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName+",DOB:="+dob
				+ ", gender=" + gender + ", designation=" + designation + ", department=" + department + ", salary="
				+ salary + "]";
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
}
