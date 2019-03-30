
public class EmployeeMain {

	public static void main(String[] args) {
		
		System.out.println("Employee object of type Employee \n");
		Employee<Double> employee = new Employee<>(100, "Anand", 35, "Male", "Sr.Developer", "IT", 50000.0);
		employee.printDetails();
		employee.appraise();

	
		System.out.println("Contractor object of type Contractor");
		Contractor contractor = new Contractor(200, "Kumar", 25, "Male", 6, 50000);
		contractor.printDetails();

	
		System.out.println("Employee object of type Person");
		Person person1 = new Employee(100, "Anand", 35, "Male", "Sr.Developer", "IT", 50000);
		person1.printDetails(); 
		person1.sayHello();
		

		System.out.println("Contractor object of type Person");
		Person person2 = new Contractor(200, "Kumar", 25, "Male", 6, 50000);
		person2.printDetails(); 

		
		System.out.println("Employee object of type Appraisable");
		Appraisable appraisable = new Employee(100, "Anand", 35, "Male", "Sr.Developer", "IT", 50000);
		
		appraisable.appraise(); 
	}
}
