
public class Employee {
	int id;
	String name;
	String designation;
	int age;
	double salary;
	String department;
	String gender;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Employee(int id, String name, int age, String gender,String designation,String department,double salary) {
		
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.age = age;
		this.salary = salary;
		this.department = department;
		this.gender = gender;
	}
	
}
