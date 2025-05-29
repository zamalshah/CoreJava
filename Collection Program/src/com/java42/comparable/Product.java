package com.java42.comparable;

public record Product(Integer prodId, String prodName,Double prodPrice) implements Comparable<Product>{

	@Override
	public int compareTo(Product prod) {
		
		return this.prodName.compareTo(prod.prodName);
	}

	@Override
	public String toString() {
		return "prodId=" + prodId + ", prodName=" + prodName+", ProdPrice="+prodPrice;
	}
	

}
