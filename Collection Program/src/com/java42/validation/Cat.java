package com.java42.validation;

public class Cat extends Animal {
	String color;

	public Cat(String name, String age, String color) {
		super(name, age);
		this.color = color;
	}
	
	public void makeSound() {
		System.out.println("Sound: Meow!");
	}

}
