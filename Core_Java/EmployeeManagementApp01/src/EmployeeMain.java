package com.corejava;

import java.util.Scanner;

public class EmployeeMain {
	static char ch;

	public static void main(String[] args) {
		EmployeeService es = new EmployeeService();

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter your Choice");
			System.out.println("1: Add Employee");
			System.out.println("2: Upadate Employee");
			System.out.println("3: View Employee");
			System.out.println("4: View All Employees");
			System.out.println("5: Delete Employee");
			System.out.println("6: Stastics");
			System.out.println("7: Exit");
			System.out.println("\n");

			switch (sc.nextInt()) {
			case 1:
				es.add();
				break;
			case 2:
				System.out.println("Please enter id");
				int id = sc.nextInt();
				es.update(id);
				break;
			case 3:
				System.out.println("Please enter id");
				int key = sc.nextInt();
				es.viewOne(key);
				break;
			case 4:
				es.viewAll();
				break;
			case 5:
				System.out.println("Please enter id");
				int key1 = sc.nextInt();
				es.delete(key1);
				break;
			case 6:
				es.stastics();
				break;
			case 7:
				System.exit(0);

			}
			System.out.println("Do you want to continue Y/N:");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
	}

}
