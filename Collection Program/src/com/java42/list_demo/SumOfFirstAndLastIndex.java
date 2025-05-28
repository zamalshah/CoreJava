package com.java42.list_demo;

import java.util.Vector;

/**
       Write a java program to add the last and first element of a given array.

       Input as: [1,2,3,4,5,6]   
       Output as: 7

 */
public class SumOfFirstAndLastIndex 
{
public static void main(String[] args) {
	
	Vector<Integer> list = new Vector<>();
	
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	list.add(6);
	
	int first = list.getFirst();
	int last = list.getLast();
	System.out.println("First element: "+first+" and Last element: "+last);
	System.out.println("Sum of first and last element: "+(first+last));
	
	
	
}
}
