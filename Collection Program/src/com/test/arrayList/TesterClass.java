package com.test.arrayList;

import java.util.*;

public class TesterClass {
	public static void main(String[] args) {

		AirlineBookingService s = new AirlineBookingService();
		AirlinePassenger p1 = new AirlinePassenger(101, "John", "Mumbai", "Pune", 150, "9998887777");
		System.out.println(s.printFare(p1));
		s.addPassenger(p1);

		AirlinePassenger p2 = new AirlinePassenger(102, "Smith", "Delhi", "Chennai", 800, "8889997777");
		System.out.println(s.printFare(p2));
		s.addPassenger(p2);

		AirlinePassenger p3 = new AirlinePassenger(101, "John", "Mumbai", "Pune", 150, "9998887777");
		System.out.println(s.printFare(p3));
		s.addPassenger(p3);

	}
}

class AirlinePassenger {
	private int passengerId;
	private String passengerName;
	private String departureCity;
	private String destinationCity;
	private int distance;
	private String phone;

	AirlinePassenger() {
	}

	AirlinePassenger(int passengerId, String passengerName, String departureCity, String destinationCity, int distance,
			String phone) {
		this.passengerId = passengerId;
		this.passengerName = passengerName;
		this.departureCity = departureCity;
		this.destinationCity = destinationCity;
		this.distance = distance;
		this.phone = phone;
	}

	public String getName() {
		return this.passengerName;
	}

	public int getDistance() {
		return this.distance;
	}

}

class AirlineBookingService {
	private ArrayList<AirlinePassenger> list = new ArrayList<AirlinePassenger>();

	AirlineBookingService() {

	}

	public void addPassenger(AirlinePassenger passenger) {
		list.add(passenger);
		System.out.println("Passenger " + passenger.getName() + " added.");
	}

	public int isExistingPassenger(AirlinePassenger passenger) {
		int r = 0;

		for (AirlinePassenger p : list) {
			if (passenger.getName().equals(p.getName())) {
				r = 1;
			}
		}
		return r;

	}

	public int calculateFare(AirlinePassenger passenger) {
		int r = 0;
		if (isExistingPassenger(passenger) == 0) {
			r = 0;
		} else if (passenger.getDistance() <= 500) {
			r = 1500;
		} else if (passenger.getDistance() > 500) {
			r = 1500 + getDistance() * 10;
//			r = 100;
		}
//		System.out.println(isExistingPassenger(passenger) == 1);
//		System.out.println(passenger.getDistance());
		return r;

	}

	private int getDistance() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String printFare(AirlinePassenger passenger) {
		return "Fare: " + passenger.getName() + ", please pay your fare of Rs." + calculateFare(passenger) + "\n";
	}

}
