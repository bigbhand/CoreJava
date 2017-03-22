package com.bb.corejava.basics.oop;

public class Triangle extends Shape{

	public Triangle(double dim1,double dim2)
	{
		super.dim1=dim1;
		super.dim2=dim2;
	}
	
	public double area()
	{
		System.out.println("Area of triangle:");
		return 0.5*dim1*dim2;
	}
}
