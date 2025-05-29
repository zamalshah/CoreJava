package com.java42.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
	public static void main(String[] args) {
		ArrayList<Customer> custList = new ArrayList<Customer>();
		custList.add(new Customer(65, "Zamal Shah", 65000d));
		custList.add(new Customer(12, "Balram Kumar", 34000d));
		custList.add(new Customer(31, "Nikhil Agnihotri", 78000d));
		custList.add(new Customer(67, "Arish Ali", 90000d));

		System.out.println("a) Based on customer number........");

		Comparator<Customer> compId = new Comparator<Customer>() {

			@Override
			public int compare(Customer c1, Customer c2) {

				return c1.getCustNumber().compareTo(c2.getCustNumber());
			}
		};
		Collections.sort(custList, compId);

		custList.forEach(System.out::println);

		System.out.println("\nb) Based on customer name........");
		// it form linear sorting technique c1.getName() compare all remaining names
		Collections.sort(custList, (c1, c2) -> c1.getCustName().compareTo(c2.getCustName()));
		custList.forEach(System.out::println);
		System.out.println("\nc) Based on customer bill........");

		custList.sort((c1, c2) -> c1.getCustBill().compareTo(c2.getCustBill()));
		custList.forEach(System.out::println);

	}
}
