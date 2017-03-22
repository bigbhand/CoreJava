package com.bb.corejava.basics.staticblocks;

public class Product {

	int id=2;
	String name;
	double price;
	static int pi;
	
	{
		System.out.println("inside initializer block .."+id);
		id=10;
		price=10;
		pi=10;
	}
	
	static{
		System.out.println("inside STATIC-initializer block");
		pi=20;
	}
	
	public Product(int id, String name, double price)
	{
		System.out.println("Before Construction : "+this.id+" "+this.name+" "+this.price+"  "+pi);
		this.id=id;
		this.name=name;
		this.price=price;
		System.out.println("After Construction : "+this.id+" "+this.name+" "+this.price+"  "+pi);
	}
	
	public void printDetails(){
		System.out.println("The product : "+id+" "+name+" "+price);
	}
	
	private static void staticMethod()
	{
		System.out.println("inside static method..");
	}
	
	
	
	
	/*private class Seller{
		
		int id;
		String name;
		
		public Seller(int id, String name){
			this.id=id;
			this.name=name;
			price=20; 
		}
	}*/
	
}


