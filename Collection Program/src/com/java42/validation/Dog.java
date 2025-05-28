package com.java42.validation;

public class Dog extends Animal {
	String breed;

	public Dog(String name, String age, String breed) {
		super(name, age);
		this.breed = breed;
	}
	@Override
	public void makeSound() {
		System.out.println("Sound: Woof!");
	}

	
}
