package com.java42.crud_by_arrayList;

import java.util.Scanner;

public class EmployeeDirectoryExample {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("1. Add Employee");
//		System.out.println("2. Display Employee");
//		System.out.println("3. Update Employee");
//		System.out.println("4. Delete Employee");
//		System.out.println("5. Exit");
//		System.out.print("Enter Option 1/2/3/4 : ");
//		int choice = Integer.parseInt(sc.nextLine());
//
//		switch (choice) {
//		case 1:
//			System.out.print("Enter Name: ");
//			String name = sc.nextLine();
//			System.out.print("Enter Position: ");
//			String position = sc.nextLine();
//			System.out.print("Enter Salary: ");
//			double salary = Double.parseDouble(sc.nextLine());
//
//			Employee emp = new Employee(name, position, salary);
//			Directory d = new Directory(emp);
//			d.addEmployee(emp);
//			
//			break;
//		case 2:
//			d.displayAllEmployees();
//			
//
//		}
		Employee e1 = new Employee("Alice", "Manager", 60000);
		Employee e2 = new Employee("Bob", "Developer", 50000);
		
		Directory d = new Directory();
		d.addEmployee(e1);
		d.addEmployee(e2);
		d.displayAllEmployees();
		
		d.updateEmployee(55000);
		d.displayAllEmployees();
		
		d.deleteEmployee(0);
		d.displayAllEmployees();	
		

	}

}
