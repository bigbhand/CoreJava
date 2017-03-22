package com.bb.corejava.basics.oop;

public class CustomException extends Exception{

	public CustomException(String msg)
	{
		//super(msg);
		System.out.println("invoked!!");
	}
}
