package com.bb.corejava.basics.oop;

public class Rectangle extends Shape implements Computable {

	public Rectangle(double dim1,double dim2)
	{
		super(dim1,dim2);
	}
	
	public double area() 
	{
		try
		{
			try
			{
			System.out.println("Area of Rectangle:");
			int x;
			compute(10);
			compute(10,20);
			}
			catch(Throwable ae)
			{
				
			}
			
			
		}catch(ArithmeticException ae)
		{
			
		}
		
		return dim1*dim2;
	}
	
	public double compute(int a)
	{
		return 0;
	}
	
	public int compute(int a,int b)
	{
		return 0;
	}
}
