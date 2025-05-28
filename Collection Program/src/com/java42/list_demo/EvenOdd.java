package com.java42.list_demo;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * Write a java program to print all even elements and odd elements separately
 * from an array. Input as : 1 2 3 4 5 6 7 Even elements are : 2 4 6 Odd
 * elements are : 1 3 5 7
 */
public class EvenOdd {
	public static void main(String[] args) {
		
		List<Integer> listOfNumber = new Vector<>();
		listOfNumber.add(1);
		listOfNumber.add(2);
		listOfNumber.add(3);
		listOfNumber.add(4);
		listOfNumber.add(5);
		listOfNumber.add(6);
		listOfNumber.add(7);
		
		List<Integer> oddNumber = new Vector<>();
		List<Integer> evenNumber = new Vector<>();
		
		
		Iterator<Integer> itr = listOfNumber.iterator();
		
		for(int li:listOfNumber) {
			if(li%2==0) {
				evenNumber.add(li);
			}
			else {
				oddNumber.add(li);
			}
		}
		
		System.out.println("Even elements are :"+oddNumber);
		System.out.println("Odd elements are :"+evenNumber);
	
	}
}
