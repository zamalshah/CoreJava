package com.java42.travel_itinerary_planner;

public class TravelItineraryPlanner {
	public static void main(String[] args) {
		ItineraryPlanner planner = new ItineraryPlanner();
		
		Destination paris = new Destination("Paris");
		
		
		Activity a1 = new Activity("Visit Eiffel Tower ", "Morning");
		Activity a2 = new Activity("Louvre Museum ", "Afternoon");
		
		paris.addActivites(a1);
		paris.addActivites(a2);
		Destination london = new Destination("London");
		
		london.addActivites(new Activity("British Museum", "Morning"));
		london.addActivites(new Activity("London Eye", "Afternoon"));
		
		planner.addDestination(paris);
		planner.addDestination(london);
		planner.display();
		
		
	}

}
