package com.bb.corejava.basics.oop;

public class Shape implements Calculatable,Computable,Drawable {

	double dim1;
	double dim2;
	
	private interface hey{
		public void doSomthing();
	}
	
	public  Shape()
	{
		System.out.println("Invoking Shape default");
	}
	public Shape(double dim1,double dim2)
	{
		super();
		System.out.println("Invoking Shape parameterized");
		this.dim1=dim1;
		this.dim2=dim2;
	}
	
	public double area()
	{
		System.out.println("computing default area");
		return 0;
	}
	@Override
	public void computeVolume() {
		double area=pi*pi;
		
		
	}
	@Override
	public void computeArea() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void draw() {
		Drawable.Hi hi=new Drawable.Hi();
		
	}
	@Override
	public void paint() {
		// TODO Auto-generated method stub
		
	}
}
