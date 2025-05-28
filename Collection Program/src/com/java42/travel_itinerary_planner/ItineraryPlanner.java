package com.java42.travel_itinerary_planner;

import java.util.ArrayList;

public class ItineraryPlanner {
	ArrayList<Destination> destList = new ArrayList<Destination>();
	
	public void addDestination(Destination dest) {
		destList.add(dest);
		
	}
	public void display() {
		destList.forEach(System.out::println);
	}

}
