package com.bb.corejava.basics.oop;

public class TestInheritence {

	public static void main(String[] args) {
		
		Shape s;
		Shape s2;
		Rectangle r=new Rectangle(10, 20);
		Circle c=new Circle(5);
		Triangle t=new Triangle(10, 12);
		s=r;
		System.out.println(s.area());
		s=c;
		System.out.println(s.area());
		s=t;
		System.out.println(s.area());
		
		Calculatable cal=new Shape();
		
		Shape sh=new Circle(20);

	}

}
