package com.java42.weakhashmap_identityhashmap;

import java.util.IdentityHashMap;

class Student {
	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "" + id + ", " + name;
	}

}

public class IdentityHashMapDemo {
	public static void main(String[] args) {
		// identityHashMap compare only through == operator so it compare only addresses

		IdentityHashMap<Student, Integer> identityMap = new IdentityHashMap<Student, Integer>();
		
		identityMap.put(new Student(111, "Zamal Shah"), 50000);
		identityMap.put(new Student(111, "Zamal Shah"), 60000);
		identityMap.put(new Student(111, "Zamal Shah"), 70000);
		identityMap.put(new Student(111, "Zamal Shah"), 80000);

		identityMap.forEach((x, y) -> System.out.println(x + " : " + y));

	}

}
