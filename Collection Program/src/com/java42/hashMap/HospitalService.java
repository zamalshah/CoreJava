package com.java42.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class HospitalService {

	ArrayList<Hospital> typeHospital = new ArrayList<Hospital>();
	
    public static int hospitalCodeCounter = 100;
	public int addHospital(Hospital hs) {
//		Random r = new Random();
//		Integer num = r.nextInt(100, 200);
//		int num = (int) Math.random() * 1000;
		hs.setHospitalCode(++hospitalCodeCounter);
		typeHospital.add(hs);
		return hs.getHospitalCode();

	}

	public HashMap<Integer, String> getHospitals() {
		HashMap<Integer, String> hmap = new HashMap();
		for (Hospital hs : typeHospital) {
			hmap.put(hs.getHospitalCode(), hs.getHospitalName());
		}

		return hmap;

	}

	public Hospital getHospitalDetails(int hsCode) {
//		Hospital hs = null;
		for (Hospital h : typeHospital) {
			if (h.getHospitalCode() == hsCode) {
				return h;
			} 

		}
		return null;

	}

}
