package com.java42.priority_queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo2 {
	public static void main(String[] args) {
		PriorityQueue<String> pq1 = new PriorityQueue<String>();
		pq1.add("Red");
		pq1.add("Green");
		pq1.add("Orange");
		PriorityQueue<String> pq2 = new PriorityQueue<String>();
		pq2.add("Pink");
		pq2.add("White");
		pq2.add("Black");
		System.out.println("Priority Queue1: " + pq1);
		pq1.addAll(pq2);

		System.out.println("Priority Queue2: " + pq2);
		System.out.println("New Priority Queue1: " + pq1);

	}
}
