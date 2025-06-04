package com.java42.treeSet;

import java.util.*;

public class Test {
	public static void main(String[] args) {

		TreeSet<Product> ts = new TreeSet<Product>((p1, p2) -> p1.pid() - p2.pid());
		System.out.println("Product id in ascending order...");
		ts.add(new Product(111, "Watch"));
		ts.add(new Product(333, "Mobile"));
		ts.add(new Product(222, "Laptop"));
		ts.add(new Product(444, "Camera"));
		ts.forEach(System.out::println);

		System.out.println("\nProduct id in decending order...");
		TreeSet<Product> tsdes = new TreeSet<Product>((p1, p2) -> p2.pid() - p1.pid());
		tsdes.add(new Product(111, "Watch"));
		tsdes.add(new Product(333, "Mobile"));
		tsdes.add(new Product(222, "Laptop"));
		tsdes.add(new Product(444, "Camera"));
		tsdes.forEach(System.out::println);

		System.out.println("\nName in descending order...");
		TreeSet<Product> tsname = new TreeSet<Product>((p1, p2) -> p2.pname().compareTo(p1.pname()));
		tsname.add(new Product(111, "Watch"));
		tsname.add(new Product(333, "Mobile"));
		tsname.add(new Product(222, "Laptop"));
		tsname.add(new Product(444, "Camera"));
		tsname.forEach(System.out::println);
	}
}

record Product(Integer pid, String pname) {
	public Product {
		if (pid <= 0) {
			throw new IllegalArgumentException("Product id can't 0 or -ve..");
		}

	}
}
