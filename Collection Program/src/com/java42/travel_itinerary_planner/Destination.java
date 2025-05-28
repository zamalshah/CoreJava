package com.java42.travel_itinerary_planner;

import java.util.ArrayList;

public class Destination {
	String destination;
	ArrayList<Activity> activities;

	public Destination(String destination) {
		super();
		this.destination = destination;
		this.activities = new ArrayList<Activity>();

	}

	public void addActivites(Activity act) {
		activities.add(act);
	}

	public ArrayList<Activity> getActivities() {
		return activities;
	}

	@Override
	public String toString() {
		String result = "Destination :" + destination + "\n";
		for (Activity x : activities) {
			result = result + x + "\n";
		}
		return result;
	}

}
