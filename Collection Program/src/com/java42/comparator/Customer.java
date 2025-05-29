package com.java42.comparator;

public class Customer {
	private Integer custNumber;
	private String custName;
	private Double custBill;

	public Customer(Integer custNumber, String custName, Double custBill) {
		super();
		this.custNumber = custNumber;
		this.custName = custName;
		this.custBill = custBill;
	}

	public Integer getCustNumber() {
		return custNumber;
	}

	public String getCustName() {
		return custName;
	}

	public Double getCustBill() {
		return custBill;
	}

	@Override
	public String toString() {
		return "custNumber: " + custNumber + ", custName " + custName + ", custBill: " + custBill;
	}

}
