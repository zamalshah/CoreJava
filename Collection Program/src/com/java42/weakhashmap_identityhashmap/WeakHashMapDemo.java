package com.java42.weakhashmap_identityhashmap;

import java.util.WeakHashMap;

class Product {
	int id;
	String name;

	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}

}

public class WeakHashMapDemo {
	public static void main(String[] args) throws InterruptedException {

		WeakHashMap<Product, Integer> weakMap = new WeakHashMap<Product, Integer>();
		Product p1 = new Product(111, "Camera");
		weakMap.put(p1, 35000);
		System.out.println(weakMap);
		p1 = null;
        System.gc();
//        Thread.sleep(1000);
		System.out.println(weakMap);

	}

}
