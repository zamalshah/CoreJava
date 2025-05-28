package com.java42.crud_by_arrayList;

import java.util.ArrayList;

public class Directory {
//	Employee emp;
	ArrayList<Employee> empList = new ArrayList<Employee>();

//	public Directory(Employee emp) {
//		super();
//		this.emp = emp;
//	}

	public void addEmployee(Employee emp) {
		empList.add(emp);
//		empList.set(0, emp);
	}

	public void displayAllEmployees() {
		empList.forEach(System.out::println);
	}

	public void updateEmployee(double salary) {
		for (Employee e : empList) {
			if (e.getName().equalsIgnoreCase("Bob")) {
				e.setPosition("Senior Developer");
				e.setSalary(salary);
				empList.set(1, e);
			}
		}
	}

	public void deleteEmployee(int index) {
		empList.remove(index);
	}

}
