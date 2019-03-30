package com.corejava;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
public class EmployeeService {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	TreeMap<Integer, Employee> tr = new TreeMap();
	Scanner sc = new Scanner(System.in);
	private static AtomicInteger idGenerator = new AtomicInteger(100);
	Employee emp;
int id=idGenerator.getAndIncrement();
	public void add() {
		System.out.println("Enter Name");
		String name = sc.next();
		boolean flag = false;
		String name1 = "[a-zA-Z ]+";
		while (!flag) {
			if ((name.matches(name1))) {

				flag = true;

			} else {
				System.out.println("enter only alphabets");
				name = sc.next();
			}
		}
		
		System.out.println("Enter Designation");
		String designation = sc.next();
		System.out.println("Enter Age");
		String age = sc.next();
		boolean isAge = false;
		String ageValidation = "[0-9]+";

		while (!isAge) {
			if (age.matches(ageValidation)) {
				int agevalue = Integer.parseInt(age);
				if (agevalue < 20 || agevalue > 80) {
					System.out.println("Enter valid age between 20 and 80");
					age = sc.next();
				} else {
					isAge = true;
				}

			} else {
				System.out.println("enter only numbers");
				age = sc.next();

			}
		}

		System.out.println("Enter Salary");
		double salary = sc.nextDouble();
		System.out.println("Enter Department");
		String department = sc.next();
		System.out.println("Enter Gender");
		String gender = sc.next();
		String match = "[a-zA-Z]+";
		boolean isGender = false;
		while (!isGender) {

			if (gender.matches(match)) {
				isGender = true;

			} else {

				System.out.println("Enter either male or female");
				gender = sc.next();

			}
		}

		emp = new Employee(id, name,designation,age,salary,department, gender);
		tr.put(id, emp);
		System.out.println("*********");
		System.out.println("Added successfully");
	}

	public void viewOne(int key) {
		if (tr.containsKey(key)) {
			Object value = tr.get(key);
			System.out.println("Key : " + key + " value :" + value);
		}
		else
		{
			System.out.println("Employee id is not found");
		}
	}

	public void update(int key) {
		if (tr.containsKey(key)) {
			System.out.println("Enter Name");
			String name = sc.next();
			boolean flag = false;
			String name1 = "[a-zA-Z ]+";
			while (!flag) {
				if ((name.matches(name1))) {

					flag = true;

				} else {
					System.out.println("enter only alphabets");
					name = sc.next();
				}
			}
			
			System.out.println("Enter Designation");
			String designation = sc.next();
			System.out.println("Enter Age");
			String age = sc.next();
			boolean isAge = false;
			String ageValidation = "[0-9]+";

			while (!isAge) {
				if (age.matches(ageValidation)) {
					int agevalue = Integer.parseInt(age);
					if (agevalue < 20 || agevalue > 80) {
						System.out.println("Enter valid age between 20 and 80");
						age = sc.next();
					} else {
						isAge = true;
					}

				} else {
					System.out.println("enter only numbers");
					age = sc.next();

				}
			}
			System.out.println("Enter Salary");
			double salary = sc.nextDouble();
			System.out.println("Enter Department");
			String department = sc.next();
			System.out.println("Enter Gender");
			String gender = sc.next();
			String match = "[a-zA-Z]+";
			boolean isGender = false;
			while (!isGender) {

				if (gender.matches(match)) {
					isGender = true;

				} else {

					System.out.println("Enter either male or female");
					gender = sc.next();

				}
			}
		}
		else
		{
			System.out.println("Employee id is not found");
		}
		
		System.out.println("Data Updated succesfully");
	}

	public void delete(int key) {
		if (tr.containsKey(key)) {
			tr.remove(key);
		}
		else
		{
			System.out.println("Employee id is not found");
		}
	}

	public void viewAll() {
		for (Map.Entry<Integer, Employee> entry : tr.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ". Value: " + entry.getValue());
		}
	}

	public void stastics() {
		int count1 = 0;
		int count2 = 0;
		int countValue = tr.size();
		double salaries;
		int salaryValue = 0;
		for (Employee emps : tr.values()) {
			int aged = Integer.parseInt(emps.age);
			//int aged=Integer.parseInt(age);
			if (aged >= 30) {
				count1++;
				} else if (aged >= 20) {
				count2++;
			}
		}
		System.out.println("Total " + count2 + " employees are of age greaterthan 20");
		System.out.println("Total " + count1 + " employees are of age greaterthan 30");
		for (Employee emps : tr.values()) {

			double sal = emps.salary;
			salaries = sal;

			salaryValue += salaries;
		}
		int averageSalary = (salaryValue) / (countValue);
		System.out.println("Average Salary of " + countValue + " employees " + averageSalary);

	}
}
