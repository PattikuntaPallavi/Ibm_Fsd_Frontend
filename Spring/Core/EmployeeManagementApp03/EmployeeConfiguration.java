package com.employee.autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
public class EmployeeConfiguration {
	@Bean
	public EmployeeDAO employeeDao() {
		return new EmployeeDAO("com.mysql.jdbc.Driver","jdbc:mysql://localhost/jdbc_training","root","");
	}
	@Bean
	public EmployeeService employee() {
		return new EmployeeService(employeeDao());
		
	}
}
