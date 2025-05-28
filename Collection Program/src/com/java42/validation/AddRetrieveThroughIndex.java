package com.java42.validation;

import java.util.ArrayList;
import java.util.Scanner;

public class AddRetrieveThroughIndex {

	static ArrayList<Object> list = new ArrayList<Object>();

	public static void addElement(Object obj) {
		if (obj instanceof String || obj instanceof Integer) {
			list.add(obj);

		} else {
			System.out.println("Element is not valid as per requirement.");
		}
	}

	public static Object retrieveElement(ArrayList<Object> arrayList, int index) {

		Object obj = null;

		try {
			if (index > arrayList.size() || index < 0) {
				throw new IndexOutOfBoundsException("The index in which you are searching is not available.");

			} else {

				obj = arrayList.get(index);
			}
		} catch (IndexOutOfBoundsException e) {
			System.err.println(e.getLocalizedMessage());
			System.exit(0);
		}

		return obj;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of elements you want to add to the list: ");
		int noOfElement = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < noOfElement; i++) {
			System.out.print("Enter element " + i + ": ");
			addElement(sc.nextLine());
		}
		System.out.print("Enter the index you want to retrieve: ");
		int index = Integer.parseInt(sc.nextLine());
		
		Object element = retrieveElement(list, index);
		
		System.out.println("Element at index "+index+": " + element);

	}

}
