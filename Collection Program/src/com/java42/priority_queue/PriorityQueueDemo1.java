package com.java42.priority_queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo1 {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("Red"); // 3
		pq.add("Green"); // 2
		pq.add("Orange"); // 4
		pq.add("White"); // 5
		pq.add("Black"); // 1
		System.out.println(pq);

	}

}
