package com.java42.validation;

public class Animal {
	String  name;
	String age;
	public Animal(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void makeSound() {
		System.out.println("Generic sound...");
	}
	public void displayInfo() {
		System.out.println("Animal: "+name+", Age: "+age);
	}
}
