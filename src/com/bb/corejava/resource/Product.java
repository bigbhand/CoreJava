package com.bb.corejava.resource;

import java.io.Serializable;

public class Product implements Cloneable,Serializable,Comparable{

	private static final long serialVersionUID = 1L;

	private int productID;
	private String productName="";
	private double price;
	
	public Product() {
		super();
	}
	
	public Product(int productID, String productName, double price) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.price = price;
	}
	
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString()
	{
		return productID+" "+productName+" "+price;
	}

	@Override
	public int compareTo(Object o) {
		
		return this.productName.compareTo(((Product)o).getProductName());
	}
	
	public int print()
	{
		System.out.println("Pribting  Produuct..");
		return 0;
	}
	
}
