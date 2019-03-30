package com.corejava;




public class Employee {
	int id;
	String name;
	String designation;
	String age;
	double salary;
	
	String department;
	String gender;
	
	public Employee(int id, String name, String designation,  String age, double salary,String department, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.age = age;
		this.salary = salary;
		
		this.department = department;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary
				+ ", age=" + age + ", department=" + department + ", gender=" + gender + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}


