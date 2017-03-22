package com.bb.corejava.basics.oop;

public class Circle extends Shape{

	public Circle(double r)
	{
		super.dim1=r;
		super.dim2=0;
	}
	
	public double area()
	{
		System.out.println("Area of Circle:");
		return 3.142*dim1*dim1;
	}
	
	public void print()
	{
		System.out.println("circle reuslt");
	}
}
