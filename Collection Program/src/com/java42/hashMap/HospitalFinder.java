package com.java42.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HospitalFinder {

	public static void main(String[] args) {
		List<String> treatment = new ArrayList<String>();
		treatment.add("Cardiac");
		treatment.add("ENT");
		treatment.add("Ortho");
		treatment.add("Pediatric");
		treatment.add("Gastro");

		Hospital h1 = new Hospital("Abc Hospital", treatment, "Mr.Shah", "9721119094", "Lucknow");
		Hospital h2 = new Hospital("Xyz Hospital", treatment, "Mr.Srivastva", "8654119094", "Varanasi");
		Hospital h3 = new Hospital("Apollo Hospital", treatment, "Mr.Mehata", "6545119094", "Gorakhpur");

		HospitalService hs = new HospitalService();
		hs.addHospital(h1);
		hs.addHospital(h2);
		hs.addHospital(h3);

		HashMap<Integer, String> hospitals = hs.getHospitals();
		System.out.println("Hospital Codes and Names:");
		System.out.println(hospitals);
		System.out.println("\nDetailed Hospital Information:");
//		Set<Integer> keySet = hospitals.keySet();
//	
//		Hospital hospitalDetails = hs.getHospitalDetails(0);
//		System.out.println(hospitalDetails);

		for(Map.Entry<Integer, String> x: hospitals.entrySet()) {
			int code = x.getKey();
			System.out.println("Code: "+code);
			System.out.println(hs.getHospitalDetails(code));
		}

	}

}
