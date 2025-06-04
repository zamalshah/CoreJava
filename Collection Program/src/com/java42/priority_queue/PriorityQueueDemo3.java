package com.java42.priority_queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo3 {
	public static void main(String[] args) {
		PriorityQueue<String> pq1 = new PriorityQueue<String>();
		PriorityQueue<String> pq2 = new PriorityQueue<String>();
		pq1.add("Red");
		pq1.add("Green");
		pq1.add("Black");
		pq1.add("White");

		pq2.add("Red");
		pq2.add("Pink");
		pq2.add("Black");
		pq2.add("Orange");
		System.out.println("First Priority Queue: " + pq1);
		System.out.println("Second Priority Queue: " + pq2);
		// through Iterator
//		Iterator<String> itr1 = pq1.iterator();
//		while (itr1.hasNext()) {
//			
//			if (pq2.contains(itr1.next())) {
//				System.out.println("Yes");
//			} else {
//				System.out.println("No");
//			}
//		}

		
		for(String s1:pq1) {
			if(pq2.contains(s1)) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}
