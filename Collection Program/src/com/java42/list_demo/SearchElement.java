package com.java42.list_demo;

/**Input as: 1 4 3 5 2 6 5
Enter searching element: 5
Output: Element found at index 3

Input as: 1 4 3 5 2 6
Enter searching element: 7
Output: Element not found*/
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class SearchElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> list = new Vector<>();
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(5);
		list.add(2);
		list.add(6);
		list.add(5);
		System.out.print("Enter searching element: ");
		int no = Integer.parseInt(sc.nextLine());
//		System.out.println(list.contains(4)); 
		int index = list.indexOf(no);
		if (index == -1) {
			System.out.println("Element not found");
		} else {

			System.out.println("Element found at index " + index);
		}

	}
}
