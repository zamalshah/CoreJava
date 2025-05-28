package com.java42.list_demo;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Sorting {
	public static void main(String[] args) {
		List<Integer> list = new Vector<>();
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(5);
		list.add(2);
		list.add(6);
		list.add(5);
		
		// sorting
		Collections.sort(list);
		list.forEach(num->System.out.print(" "+num));
		

		System.out.println("");
		// Iterator for forword retrival
		Iterator itr = list.iterator();
		System.out.println("In forward Order............");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// for backward retrieval we need ListIterator = it can retrieve both forward+backward
		
		ListIterator<Integer> listItr = list.listIterator();
		System.out.println("In forward Order through ListIterator............");
		
		while(listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		
        System.out.println("In reverse Order............");
		
		while(listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
