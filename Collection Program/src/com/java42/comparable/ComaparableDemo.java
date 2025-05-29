package com.java42.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComaparableDemo {
	public static void main(String[] args) {
		
		ArrayList<Product> prodList = new ArrayList<Product>();
		prodList.add(new Product(8, "Laptop",65000.0));
		prodList.add(new Product(5, "Mobile", 23200d));
		prodList.add(new Product(2, "Camera", 35000D));
		prodList.add(new Product(7, "Bag",2500d));
		prodList.add(new Product(0, "Fan",5000d));
		prodList.add(new Product(6, "Tube Light", 1200d));
		prodList.add(new Product(15, "Chair", 3000d));
		prodList.add(new Product(10, "Projector", 70000d));
		prodList.add(new Product(20, "Speaker",40000d));
		prodList.add(new Product(1, "Watch",2000d));
		
		Collections.sort(prodList);
		
		prodList.forEach(System.out::println);
		
		
		
		

	}
}
